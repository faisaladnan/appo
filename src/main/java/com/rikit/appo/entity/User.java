package com.rikit.appo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@NotNull
	private String email;
	
	@NotNull	
	private String password;
	
	@NotNull	
	private UserState state;
	
	@NotNull
	private String verificationCode;
}
