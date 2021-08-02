package assignment10.Test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean, DisposableBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Using applicationContextAware Interface");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Using applicationContextAware Interface");
		
	}

	@Override
	public String toString() {
		return "LifeCycle [message=" + message + "]";
	}
}
