package com.wsmsz.study.system.role.service.impl;

import com.github.pagehelper.PageHelper;
import com.wsmsz.study.system.role.bean.Role;
import com.wsmsz.study.system.role.mapper.RoleMapper;
import com.wsmsz.study.system.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RoleServiceImpl
 * @Description TODO
 * @Author wang
 * @Date 2019/9/6 14:46
 * @Version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Role record) {
        return this.roleMapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return this.roleMapper.insertSelective(record);
    }

    @Override
    public Role selectByPrimaryKey(Integer id) {
        return this.roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return this.roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return this.roleMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Role> selectRoleAll(Role role) {
        PageHelper.startPage(role.getPageUtil().getPageNum(),role.getPageUtil().getPageSize());
        return this.roleMapper.selectRoleAll(role);
    }
}
