/**
 * 
 */
package com.java.techhub.email.demo;

import java.util.ArrayList;
import java.util.List;

import com.java.techhub.email.demo.model.TargetEmail;
import com.java.techhub.email.demo.model.User;

import lombok.experimental.UtilityClass;

/**
 * @author mahes
 *
 */
@UtilityClass
public final class UserUtil {

	public User getUser(boolean addTargets) {
		User user = new User();
        user.setFirstName("Tony");
        user.setLastName("Nguyen");
        user.setLocation("IND");
        List<TargetEmail> list = new ArrayList<>();
        if(addTargets) {
            list.add(new TargetEmail("Nguyen", "Tuyen", "tuyennv1983@gmail.com"));
        }
        user.setEmails(list);
        return user;
	}
}
