package com.gzf.controller;/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/7/20
 * @Introduce
 */

import com.gzf.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName UserController
 *@Author gzf
 *@Date 2020/7/20 15:28
 *@Description TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/query")
    public Object query(){
        return userService.query();
    }
}
