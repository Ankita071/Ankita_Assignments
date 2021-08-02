package usingProgrammaticApproach;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Intro implements InitializingBean, DisposableBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Using Programmatic Approach for initializing bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Using Programmatic Approach for disposable bean");
	}
	
	public void name() {
		System.out.println("H");
	}
}
