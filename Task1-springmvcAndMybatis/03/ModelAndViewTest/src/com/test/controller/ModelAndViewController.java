package com.test.controller;

import com.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Controller注解用于指示该类是一个控制器，可以同时处理多个请求动作
@Controller
public class ModelAndViewController {

    @RequestMapping(value = "/ModelAndViewTest")
    public ModelAndView ModelAndViewTest(ModelAndView mv){
        System.out.println("ModelAndViewTest");
        User user=new User();
        user.setUsername("疯狂的石头");
        mv.addObject("user",user);
        //设置要转发的页面
        mv.setViewName("result");
        return mv;
    }

}
