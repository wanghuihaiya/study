package com.wsmsz.study.system.login.service.impl;

import com.github.pagehelper.PageHelper;
import com.wsmsz.study.system.login.bean.UserBean;
import com.wsmsz.study.system.login.mapper.LoginMapper;
import com.wsmsz.study.system.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName LoginServiceImpl
 * @Description TODO
 * @Author wang
 * @Date 2019/8/30 9:18
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserBean checkLogin(UserBean userBean) {

        return this.loginMapper.checkLogin(userBean);
    }

    @Override
    public void saveUser(UserBean userBean) {
        this.loginMapper.saveUser(userBean);
    }

    @Override
    public void updateUser(UserBean userBean) {
        this.loginMapper.updateUser(userBean);
    }

    @Override
    public void deleteUser(UserBean userBean) {
        this.loginMapper.deleteUser(userBean);
    }

    @Override
    public List<UserBean> selectUserAll(UserBean userBean,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return this.loginMapper.selectUserAll(userBean);
    }
}
