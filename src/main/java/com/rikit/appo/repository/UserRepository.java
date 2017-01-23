package com.rikit.appo.repository;

import org.springframework.data.repository.CrudRepository;

import com.rikit.appo.entity.User;

public interface UserRepository extends CrudRepository<User, Long>
{
	public User findByEmail(String email);
	public User findByVerificationCode(String verificationCode);
	
}
