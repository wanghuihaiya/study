package com.wsmsz.study.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWord
 * @Description TODO
 * @Author wang
 * @Date 2019/8/28 10:24
 * @Version 1.0
 */
@RestController
@RequestMapping("wsmsz")
public class HelloWord {

    @RequestMapping("hello")
    public String hello(){

        return "hello!!!  吴思民 ---  大傻子！！！";
    }

}
