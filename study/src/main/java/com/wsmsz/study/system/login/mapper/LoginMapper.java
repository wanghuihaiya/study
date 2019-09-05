package com.wsmsz.study.system.login.mapper;

import com.wsmsz.study.system.login.bean.UserBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginMapper {

    UserBean checkLogin(UserBean userBean);

    void saveUser(UserBean userBean);

    void updateUser(UserBean userBean);

    void deleteUser(UserBean userBean);

    List<UserBean> selectUserAll(UserBean userBean);

}
