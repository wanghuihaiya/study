package com.wsmsz.study.system.login;

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

    @RequestMapping("loginIndex")
    public String toLoginIndex(){

        return "/html/login";
    }

}
