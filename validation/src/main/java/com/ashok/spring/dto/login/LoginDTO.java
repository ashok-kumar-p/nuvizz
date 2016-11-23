package com.ashok.spring.dto.login;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginDTO implements Serializable {

	@NotNull
	@Size(max = 3, min = 2)
	private String userid;
	@NotNull
	@Size(max = 3, min = 2)
	private String pwd;

	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName() + "\tCreated...");
	}

	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + "]";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
