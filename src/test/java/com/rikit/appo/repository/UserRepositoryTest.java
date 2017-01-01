package com.rikit.appo.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.rikit.appo.entity.User;

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
		
		entityManager.persist(user);
		
		User foundUser = userRepository.findByEmail("user@email.com");
		Assert.assertNotNull(foundUser.getId());
		Assert.assertEquals(foundUser.getEmail(), "user@email.com");
		Assert.assertEquals(foundUser.getPassword(), "123456");
	}
}
