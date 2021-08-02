package assignment3;

import org.springframework.stereotype.Component;

@Component
public class UserModel {
	public boolean validation(String name, String email, String password) {
		return name.equalsIgnoreCase("Xyz") && email.equals("xyz@gmail.com") && password.equals("dummy");
	}
}
