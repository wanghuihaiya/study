package com.wsmsz.study.system.login.service;

import com.wsmsz.study.system.login.bean.UserBean;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author wang
 * @Date 2019/8/30 9:18
 * @Version 1.0
 */
public interface LoginService {

    public UserBean checkLogin(UserBean userBean);

}
