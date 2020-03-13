package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  HelloWorldController��һ������ע��Ŀ�����,
 *  ����ͬʱ����������������������ʵ���κνӿڡ�
 *  org.springframework.stereotype.Controllerע������ָʾ������һ��������
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message","Hello World");
        return "helloWorld";
    }
}
