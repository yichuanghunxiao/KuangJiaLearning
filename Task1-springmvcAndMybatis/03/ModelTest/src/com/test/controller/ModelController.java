package com.test.controller;

import com.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controllerע������ָʾ������һ��������������ͬʱ������������
 */
@Controller
public class ModelController {

    @RequestMapping(value = "/modelTest")
    public String modelTest(Model model){
        System.out.println("modelTest");
        User user=new User();
        // ����user�����username����
        user.setUsername("������");
        // ��User������ӵ�Model����
        model.addAttribute("user",user);
        return "result1";
    }

    @RequestMapping(value = "/modelMapTest")
    public String modelMapTest(ModelMap modelMap){
        System.out.println("modelMapTest");
        User user=new User();
        // ����user�����username����
        user.setUsername("������");
        // ��User������ӵ�ModelMap����
        modelMap.addAttribute("user",user);
        return "result2";
    }
}
