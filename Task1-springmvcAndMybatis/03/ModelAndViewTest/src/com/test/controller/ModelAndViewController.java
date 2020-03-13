package com.test.controller;

import com.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Controllerע������ָʾ������һ��������������ͬʱ������������
@Controller
public class ModelAndViewController {

    @RequestMapping(value = "/ModelAndViewTest")
    public ModelAndView ModelAndViewTest(ModelAndView mv){
        System.out.println("ModelAndViewTest");
        User user=new User();
        user.setUsername("����ʯͷ");
        mv.addObject("user",user);
        //����Ҫת����ҳ��
        mv.setViewName("result");
        return mv;
    }

}
