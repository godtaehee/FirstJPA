package hellojpa;

import javax.persistence.Entity;

@Entity
public class Student extends Member{

	String student;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}
}
