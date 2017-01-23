package com.rikit.appo.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.rikit.appo.entity.User;
import com.rikit.appo.entity.UserState;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testFindByEmail()
	{
		User user = new User();
		user.setEmail("user@email.com");
		user.setPassword("123456");
		user.setState(UserState.INIT);
		user.setVerificationCode("123456");
		
		entityManager.persist(user);
		
		User foundUser = userRepository.findByEmail(user.getEmail());
		Assert.assertNotNull(foundUser.getId());
		Assert.assertEquals(user.getEmail(), foundUser.getEmail());
		Assert.assertEquals(user.getPassword(), foundUser.getPassword());
		Assert.assertEquals(user.getState(), foundUser.getState());
		Assert.assertEquals(user.getVerificationCode(), foundUser.getVerificationCode());
	}
}
