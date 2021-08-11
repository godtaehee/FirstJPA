package hellojpa;

import javax.persistence.Entity;

@Entity
public class Teacher extends Member{
	String teacher;

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
}
