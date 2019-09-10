package com.wsmsz.study.system.role.bean;

import com.wsmsz.study.utils.ResponsUtil.PageUtil;

public class Role {
    private Integer id;

    private String roleName;

    private String roleState;

    private String roleDesc;

    private PageUtil pageUtil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleState() {
        return roleState;
    }

    public void setRoleState(String roleState) {
        this.roleState = roleState == null ? null : roleState.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public PageUtil getPageUtil() {
        return pageUtil;
    }

    public void setPageUtil(PageUtil pageUtil) {
        this.pageUtil = pageUtil;
    }
}