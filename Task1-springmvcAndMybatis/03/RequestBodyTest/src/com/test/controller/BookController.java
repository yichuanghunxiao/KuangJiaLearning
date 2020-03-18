package com.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/json")
public class BookController {

    // @RequestBody����json���ݣ�ת���ɶ�Ӧ��Object
    @RequestMapping(value = "/testRequestBody")
    public void setJson(@RequestBody Book book, HttpServletResponse response)throws Exception{
        // ObjectMapper����Jackson�����Ҫ�ࡣ���ṩһЩ���ܽ�Java����ת���ɶ�Ӧ��JSON��ʽ������
        ObjectMapper mapper=new ObjectMapper();
        //��book����ת����json���
        System.out.println(mapper.writeValueAsString(book));
        book.setAuthor("������");
        response.setContentType("text/html;charset=UTF-8");
        //��book����ת����jsonд�����ͻ���
        response.getWriter().println(mapper.writeValueAsString(book));
    }
}
