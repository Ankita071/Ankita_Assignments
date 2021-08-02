package usingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Intro {
	@PostConstruct
	public void init() throws Exception {
		System.out.println("Using Annotation for initializing bean");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Using Annotation for disposable bean");
	}
}
