package com.project.service;

import javax.security.auth.login.LoginException;

import com.project.model.LoginData;
public interface LoginService {
	
	public String logInAccount(LoginData loginData) throws LoginException;
	public String logOutFromAccount(String key) throws LoginException;

}
