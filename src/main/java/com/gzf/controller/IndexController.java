package com.gzf.controller;/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/7/20
 * @Introduce
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@ClassName IndexController
 *@Author gzf
 *@Date 2020/7/20 13:10
 *@Description TODO
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @ResponseBody
    @RequestMapping("/json")
    public String json(){
        System.out.println("测试");
        return "测试返回json数据";
    }
    @RequestMapping("/jsp")
    public String jsp(){
        System.out.println("跳转页面");
        return "test";
    }
}
