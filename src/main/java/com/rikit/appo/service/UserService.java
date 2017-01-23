package com.rikit.appo.service;

import com.rikit.appo.entity.User;

public interface UserService {

	public User register(String email, String password);
	public boolean verify(String code);
}
