package com.java.techhub.email.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.techhub.email.demo.service.EmailService;

/**
 * @author mahes
 *
 */
@SpringBootTest
class EmailServiceTest {

	@Autowired
	private EmailService emailService;
	
	@Test
	void testSendEmail() throws Exception {
		String response = emailService.sendEmail(UserUtil.getUser(true));
		Assertions.assertEquals("Email(s) sent successfully, Please check your inbox...!!!",	 response);
	}
	
	/*@Test
	void testSendEmailWithoutTargets() throws Exception {
		String response = emailService.sendEmail(UserUtil.getUser(false));
		Assertions.assertEquals("1 email(s) sending failed. Please verify logs...!!!",	 response);
	}*/
}
