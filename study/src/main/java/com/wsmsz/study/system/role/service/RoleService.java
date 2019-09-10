package com.wsmsz.study.system.role.service;

import com.wsmsz.study.system.role.bean.Role;

import java.util.List;

public interface RoleService {

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> selectRoleAll(Role role);

}
