package com.project.service;

import com.project.exception.LoginException;
import com.project.model.CurrentUserSession;
import com.project.model.SignUp;

public interface CurrentUserSessionService {
	
	public CurrentUserSession getCurrentUserSession(String key) throws LoginException;;
	public Integer getCurrentUserSessionId(String key) throws LoginException;;
	
	public SignUp getSignUpDetails(String key) throws LoginException;;
	

}
