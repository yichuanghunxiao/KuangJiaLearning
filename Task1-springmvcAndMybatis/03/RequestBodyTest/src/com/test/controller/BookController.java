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

    // @RequestBody根据json数据，转换成对应的Object
    @RequestMapping(value = "/testRequestBody")
    public void setJson(@RequestBody Book book, HttpServletResponse response)throws Exception{
        // ObjectMapper类是Jackson库的主要类。它提供一些功能将Java对象转换成对应的JSON格式的数据
        ObjectMapper mapper=new ObjectMapper();
        //将book对象转换成json输出
        System.out.println(mapper.writeValueAsString(book));
        book.setAuthor("黄先生");
        response.setContentType("text/html;charset=UTF-8");
        //将book对象转换成json写出到客户端
        response.getWriter().println(mapper.writeValueAsString(book));
    }
}
