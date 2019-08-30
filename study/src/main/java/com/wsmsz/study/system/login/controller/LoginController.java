package com.wsmsz.study.system.login.controller;

import com.wsmsz.study.system.login.bean.UserBean;
import com.wsmsz.study.system.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author wang
 * @Date 2019/8/28 10:36
 * @Version 1.0
 */
@Controller
@RequestMapping("wsmsz/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("loginIndex")
    public String toLoginIndex(){
        UserBean userBean=new UserBean();
        userBean.setUserName("wsm");
        userBean.setUserPassword("wsmsz");
        loginService.checkLogin(userBean);
        return "/html/login";
    }

}
