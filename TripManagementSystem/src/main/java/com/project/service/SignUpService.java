package com.project.service;

import javax.security.auth.login.LoginException;

import com.project.model.SignUp;

public interface SignUpService {
	
	public SignUp createNewSignUp(SignUp signUp) throws LoginException;;
	
	public SignUp updateSignUpDetails(SignUp signUp,String key) throws LoginException;;

}
