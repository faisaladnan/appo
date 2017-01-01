package com.rikit.appo.service;

import com.rikit.appo.entity.User;

public interface UserService {

	public User createUser(String email, String password);
}
