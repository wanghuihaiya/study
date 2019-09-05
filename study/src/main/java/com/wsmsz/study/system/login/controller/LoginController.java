package com.wsmsz.study.system.login.controller;

import com.wsmsz.study.system.login.bean.UserBean;
import com.wsmsz.study.system.login.service.LoginService;
import com.wsmsz.study.utils.ResponsUtil.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author wang
 * @Date 2019/8/28 10:36
 * @Version 1.0
 */
@RestController
@RequestMapping("wsmsz/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("loginIndex")
    public UserBean toLoginIndex(){
        UserBean userBean=new UserBean();
        userBean.setUserName("wsm");
        userBean.setUserPassword("wsmsz");
        UserBean userBean1 =loginService.checkLogin(userBean);
        return userBean1;
    }

    /**
     * 登录
     * @param request
     * @param response
     * @param userBean
     * @return
     */
    @RequestMapping("loginChick")
    public BaseResponse loginChick(HttpServletRequest request, HttpServletResponse response, @RequestBody UserBean userBean){
        UserBean userBean1 =loginService.checkLogin(userBean);
        if(userBean1 != null){
            request.getSession().setAttribute("userBean",userBean1);
            return BaseResponse.success("登录成功！");
        }else {
            return BaseResponse.error("登录失败");
        }
    }

    /**
     * 用户新增
     * @param request
     * @param response
     * @param userBean
     * @return
     */
    @RequestMapping("saveUser")
    public BaseResponse saveUser(HttpServletRequest request,HttpServletResponse response, @RequestBody UserBean userBean){
        try {
            this.loginService.saveUser(userBean);
        }catch (Exception e){
            return BaseResponse.error("用户新增失败");
        }
        return BaseResponse.success("用户新增成功！");
    }
    /**
     * 用户修改
     * @param request
     * @param response
     * @param userBean
     * @return
     */
    @RequestMapping("updateUser")
    public BaseResponse updateUser(HttpServletRequest request,HttpServletResponse response, @RequestBody UserBean userBean){
        try {
            this.loginService.updateUser(userBean);
        }catch (Exception e){
            return BaseResponse.error("用户修改失败");
        }
        return BaseResponse.success("用户修改成功！");
    }
    /**
     * 用户删除
     * @param request
     * @param response
     * @param userBean
     * @return
     */
    @RequestMapping("deleteUser")
    public BaseResponse deleteUser(HttpServletRequest request,HttpServletResponse response, @RequestBody UserBean userBean){
        try {
            this.loginService.deleteUser(userBean);
        }catch (Exception e){
            return BaseResponse.error("用户删除失败");
        }
        return BaseResponse.success("用户删除成功！");
    }

    /**
     * 用户查询
     * @param userBean
     * @return
     */
    @RequestMapping("selectUserAll")
    public BaseResponse selectUserAll(@RequestBody UserBean userBean){
        List<UserBean> userBeans = this.loginService.selectUserAll(userBean,userBean.getPage().getPageNum(),userBean.getPage().getPageSize());
        return BaseResponse.success("查询成功！",userBeans);

    }
}
