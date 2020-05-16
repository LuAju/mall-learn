package com.learn.mall.controller;

import com.learn.mall.model.UmsAdmin;
import com.learn.mall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "UmsAdminController", description = "用户管理")
@Controller
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;

    @RequestMapping("getUser/{id}")
    @ApiOperation("获取用户信息")
    public @ResponseBody Object select(@PathVariable("id") Long id){
        UmsAdmin umsAdmin = umsAdminService.selectByPrimaryKey(id);
        return umsAdmin;
    }

    @GetMapping("deleteUser/{id}")
    @ApiOperation("删除角色")
    public @ResponseBody Object delete(@PathVariable("id") Long id){
        return null;
    }
}
