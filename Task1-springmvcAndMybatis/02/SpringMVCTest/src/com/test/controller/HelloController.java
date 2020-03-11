package com.test.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  HelloController��һ��ʵ��Controller�ӿڵĿ�����,
 *  ���Դ���һ����һ��������
 */
public class HelloController implements Controller {
    /**
     * handleRequest��Controller�ӿڱ���ʵ�ֵķ�����
     * �÷����Ĳ����Ƕ�Ӧ�����HttpServletRequest��HttpServletResponse��
     * �÷������뷵��һ��������ͼ·������ͼ·����ģ�͵�ModelAndView����
     * */
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("handleRequest ������");
        // ����׼�����ص�ModelAndView���󣬸ö���ͨ�������˷�����ͼ��·����ģ�͵������Լ�ģ�Ͷ���
        ModelAndView mv=new ModelAndView();
        // ���ģ������ �����������POJO����
        mv.addObject("message","Hello World");
        //�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        // ����ModelAndView����
        return mv;
    }
}
