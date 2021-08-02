package assignment5.Test;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SuppressWarnings({ "unused", "deprecation" })
@Component
@Configuration
public class Student {
	int studentId;
	String StudentName;
	String studentAge;
	
	@Inject
	StudentMarks studentMarks;
	
	@Resource
	StudentCourse studentCourse;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentAge, StudentMarks studentMarks,
			StudentCourse studentCourse) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
		this.studentCourse = studentCourse;
	}
	@Required
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	
	@Required
	public StudentMarks getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(StudentMarks studentMarks) {
		this.studentMarks = studentMarks;
	}

	public StudentCourse getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(StudentCourse studentCourse) {
		this.studentCourse = studentCourse;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", studentAge=" + studentAge
				+ ", studentMarks=" + studentMarks + ", studentCourse=" + studentCourse + "]";
	}

	
	
	
}
