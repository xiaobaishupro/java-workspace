package com.example.ruijistudy.controller;

import com.example.ruijistudy.entity.SysUser;
import com.example.ruijistudy.service.ISysUserService;
import com.example.ruijistudy.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 努力的派大星
 * @version 1.0
 */
@Api("用户")
@RestController
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @PostMapping("/add")
    @ApiOperation("增加用户")
    public Result insert(@RequestBody SysUser sysUser){
        System.out.println(sysUser.toString());
        return Result.suc(sysUserService.saveOrUpdate(sysUser));
    }
}
