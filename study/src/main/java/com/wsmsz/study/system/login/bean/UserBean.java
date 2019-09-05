package com.wsmsz.study.system.login.bean;

import com.wsmsz.study.utils.ResponsUtil.PageUtil;

import java.io.Serializable;

/**
 * @ClassName UserBean
 * @Description TODO
 * @Author wang
 * @Date 2019/8/30 10:07
 * @Version 1.0
 */
public class UserBean implements Serializable {

    private int userId;

    private String userName;

    private String userPassword;

    private String userSex;

    private String userPhone;

    private int userRole;

    private int userState;

    private String userDesc;

    private PageUtil page;

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public PageUtil getPage() {
        return page;
    }

    public void setPage(PageUtil page) {
        this.page = page;
    }
}
