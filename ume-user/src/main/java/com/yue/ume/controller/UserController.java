package com.yue.ume.controller;

import com.yue.ume.domain.User;
import com.yue.ume.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @author Yue
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户信息", tags = "用户信息")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    @ApiOperation(value = "根据Id查询用户信息")
    public User query(@ApiParam(value = "用户Id", required = true) @NotNull(message = "用户Id不能为空") @PathVariable("userId") Long userId) {
        return userService.getById(userId);
    }
}
