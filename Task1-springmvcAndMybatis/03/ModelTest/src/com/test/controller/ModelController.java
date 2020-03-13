package com.test.controller;

import com.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
 */
@Controller
public class ModelController {

    @RequestMapping(value = "/modelTest")
    public String modelTest(Model model){
        System.out.println("modelTest");
        User user=new User();
        // 设置user对象的username属性
        user.setUsername("疯狂软件");
        // 将User对象添加到Model当中
        model.addAttribute("user",user);
        return "result1";
    }

    @RequestMapping(value = "/modelMapTest")
    public String modelMapTest(ModelMap modelMap){
        System.out.println("modelMapTest");
        User user=new User();
        // 设置user对象的username属性
        user.setUsername("疯狂软件");
        // 将User对象添加到ModelMap当中
        modelMap.addAttribute("user",user);
        return "result2";
    }
}
