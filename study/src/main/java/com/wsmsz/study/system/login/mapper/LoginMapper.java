package com.wsmsz.study.system.login.mapper;

import com.wsmsz.study.system.login.bean.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    UserBean checkLogin(UserBean userBean);

}
