package com.wsmsz.study.system.role.controller;

import com.wsmsz.study.system.role.bean.Role;
import com.wsmsz.study.system.role.service.RoleService;
import com.wsmsz.study.utils.ResponsUtil.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @ClassName RoleController
 * @Description TODO
 * @Author wang
 * @Date 2019/9/9 9:31
 * @Version 1.0
 */
@Repository("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查询数据
     * @param request
     * @param response
     * @param role
     * @return
     */
    @RequestMapping("selectRoleAll")
    public BaseResponse selectRoleAll(HttpServletRequest request, HttpServletResponse response, @RequestBody Role role){
        List<Role> roleList =  this.roleService.selectRoleAll(role);
        return new BaseResponse(200,"查询成功",roleList);
    }
    /**
     * 新增数据
     * @param request
     * @param response
     * @param role
     * @return
     */
    @RequestMapping("saveRole")
    public BaseResponse saveRole(HttpServletRequest request, HttpServletResponse response, @RequestBody Role role){
        int rows =  this.roleService.insert(role);
        if(rows != 0){
            return new BaseResponse(200,"新增成功！");
        }else {
            return new BaseResponse(500, "新增失败！");
        }
    }
    /**
     * 修改数据
     * @param request
     * @param response
     * @param role
     * @return
     */
    @RequestMapping("updateRole")
    public BaseResponse updateRole(HttpServletRequest request, HttpServletResponse response, @RequestBody Role role){
        int rows =  this.roleService.updateByPrimaryKey(role);
        if(rows != 0){
            return new BaseResponse(200,"修改成功！");
        }else {
            return new BaseResponse(500, "修改失败！");
        }
    }
    /**
     *
     * 删除数据
     * @param request
     * @param response
     * @param id
     * @return
     */
    @RequestMapping("deleteRole")
    public BaseResponse deleteRole(HttpServletRequest request, HttpServletResponse response, @RequestParam Integer id){
        int rows =  this.roleService.deleteByPrimaryKey(id);
        if(rows != 0){
            return new BaseResponse(200,"删除成功！");
        }else {
            return new BaseResponse(500, "删除失败！");
        }
    }
}
