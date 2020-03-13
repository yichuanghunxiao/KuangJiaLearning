package com.test.controller;

import com.test.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

// Controllerע������ָʾ������һ��������������ͬʱ������������
@Controller
// RequestMapping��������ע��һ���������࣬��ʱ�����з�������ӳ��Ϊ������༶�������,
// ��ʾ�ÿ������������е����󶼱�ӳ�䵽 value������ָʾ��·����
@RequestMapping(value = "/user")
public class UserController {

    //��̬List<User>���ϣ��˴��������ݿ���������ע����û���Ϣ
    public static List<User> userList;

    // UserController��Ĺ���������ʼ��List<User>����
    public UserController() {
        super();
        userList=new ArrayList<User>();
    }

    // �÷���ӳ�������Ϊhttp://localhost:8080/context/user/register���÷���֧��GET����
    @GetMapping(value = "/register")
    public String registerForm(){
        System.out.println("register GET����������...");
        //��ת��ע��ҳ��
        return "registerForm";
    }

    //�÷���ӳ�������Ϊhttp://localhost:8080/RequestMappingTest/user/register���÷���֧��POST����
    @PostMapping(value = "/register")
    // �������е�loginname������ֵ����loginname����,password��usernameͬ������
    public String register(
            @RequestParam("loginname")String loginname,
            @RequestParam("password")String password,
            @RequestParam("username")String username){
        System.out.println("register POST����������...");
        //����user����
        User user=new User();
        user.setLoginname(loginname);
        user.setUsername(username);
        user.setPassword(password);
        //ģ�����ݿ�洢User��Ϣ
        userList.add(user);
        //��ת����¼ҳ��
        return "loginForm";
    }

    //�÷���ӳ�������Ϊhttp://localhost:8080/RequestMappingTest/user/login
    @RequestMapping("/login")
    public String login(
            // �������е�loginname������ֵ����loginname����,passwordͬ������
            @RequestParam("loginname")String loginname,
            @RequestParam("password")String password,
            Model model){
        System.out.println("��½����"+loginname+" ���룺"+password);
        // �������в����û��Ƿ���ڣ��˴�����ģ�����ݿ���֤
        for (User user:userList){
            if (user.getLoginname().equals(loginname)&&user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "welcome";
            }
        }
        return "loginForm";
    }

}
