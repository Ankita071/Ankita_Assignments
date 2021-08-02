package assignment9.Test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean, DisposableBean{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying");
		
	}

	@Override
	public String toString() {
		return "LifeCycle [message=" + message + "]";
	}
}
