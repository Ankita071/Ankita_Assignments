package assignment4;

import org.springframework.stereotype.Component;

@Component
public class UserModel {
	String user = "";
	String password = "";
	String email = "";

	public void UserLogin(String user, String password, String email) {
		this.user = user;
		this.password = password;
		this.email = email;
	}
	
	public boolean validation(String user, String password) {
			if (user.equals(this.user) && password.equals(this.password)) {
				return true;
			} else {
				return false;
			}
	}

}
