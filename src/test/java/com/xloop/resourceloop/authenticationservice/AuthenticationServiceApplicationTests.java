package com.xloop.resourceloop.authenticationservice;

import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.xloop.resourceloop.authenticationservice.JPARepository.UserRepository;

@SpringBootTest
class AuthenticationServiceApplicationTests {

	@Mock
	private UserRepository userRepo;

	@Test
	void contextLoads() {
	}

}
