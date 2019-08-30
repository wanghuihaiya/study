package com.wsmsz.study.system.login.service.impl;

import com.wsmsz.study.system.login.bean.UserBean;
import com.wsmsz.study.system.login.mapper.LoginMapper;
import com.wsmsz.study.system.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        return loginMapper.checkLogin(userBean);
    }
}
