package com.test.domain;

import java.io.Serializable;

// 域对象，实现序列化接口
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	// 私有字段
	private String loginname;
	private String password;
	private String username;
	
	// 公共构造器
	public User() {
		super();
	}
	// set/get方法
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
