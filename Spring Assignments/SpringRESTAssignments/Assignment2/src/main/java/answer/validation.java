package answer;

import org.springframework.stereotype.Component;

@Component
public class validation{
	String userName;
	String password;
	public validation() {
		
	}
	public validation(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "validation [userName=" + userName + ", password=" + password + "]";
	}
	
}