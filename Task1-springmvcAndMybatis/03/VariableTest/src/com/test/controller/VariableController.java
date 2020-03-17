package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class VariableController {

    // ����@PathVariableע��
    // �÷���ӳ�������Ϊ/VariableTest/pathVariableTest/1
    @GetMapping(value = "/pathVariableTest/{userId}")
    public void pathVariableTest(
            @PathVariable Integer userId){
        System.out.println("ͨ��@PathVariable������ݣ�userId="+userId);
    }

    // ����@MatrixVariableע��
    // �÷���ӳ�������Ϊ/VariableTest/matrixVariableTest/1;name=jack;age=23
    @GetMapping(value = "/matrixVariableTest/{userId}")
    public void matrixVariableTest(
            @PathVariable Integer userId,
            @MatrixVariable(value = "name",pathVar = "userId")String name,
            @MatrixVariable(value = "age",pathVar = "userId")Integer age){
        System.out.println("ͨ��PathVariable������ݣ�userId="+userId);
        System.out.println("ͨ��MatrixVariable������ݣ�name="+name+" age="+age);
    }

    // ����@MatrixVariableע��ĸ�������
    // �÷���ӳ�������Ϊ//VariableTest/productTest/computer;brand=apple,acer;low=2000;height=10000
    @GetMapping(value = "/productTest/{goods}")
    public void productTest(
            @PathVariable String goods,
            @MatrixVariable(value = "brand",pathVar = "goods")List<String> brand,
            @MatrixVariable(value = "height",pathVar = "goods")Integer low,
            @MatrixVariable(value = "height",pathVar = "goods")Integer height){
        System.out.println("ͨ��@PathVariable������ݣ� goods=" + goods);
        System.out.println("ͨ��@MatrixVariable������ݣ�brand="  + brand);
        System.out.println("ͨ��@MatrixVariable������ݣ� low="  + low + " height="+ height);
    }


}
