package com.wsmsz.study.system.login.service;

import com.wsmsz.study.system.login.bean.UserBean;

import java.util.List;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author wang
 * @Date 2019/8/30 9:18
 * @Version 1.0
 */
public interface LoginService {

    public UserBean checkLogin(UserBean userBean);

    public void saveUser(UserBean userBean);

    public void updateUser(UserBean userBean);

    public void deleteUser(UserBean userBean);

    List<UserBean> selectUserAll(UserBean userBean,int pageNum,int pageSize);

}
