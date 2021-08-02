package assignment5.Test;

import org.springframework.stereotype.Component;

@Component
public class StudentCourse {
	String course;

	public StudentCourse() {
		super();
	}

	public StudentCourse(String course) {
		super();
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentCourse [course=" + course + "]";
	}
	
	
}
