package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *  HelloController��һ������ע��Ŀ�����,
 *  ����ͬʱ����������������������ʵ���κνӿڡ�
 *  org.springframework.stereotype.Controllerע������ָʾ������һ��������
 */
@Controller
public class HelloController {

    /**
     * org.springframework.web.bind.annotation.RequestMappingע��
     * ����ӳ������ĵ�URL������ķ����ȡ���������ӳ��"/hello"
     * helloֻ��һ����ͨ������
     * �÷�������һ��������ͼ·������ͼ·����ģ�͵�ModelAndView����
     * */
    @RequestMapping(value = "/hello")
    public ModelAndView hello(){
        System.out.println("hello����������");
        // ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
        ModelAndView mv=new ModelAndView();
        //���ģ������ �����������POJO����
        mv.addObject("message","Hello World!");
        // �����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        //����ModelAndView����
        return mv;

    }
}
