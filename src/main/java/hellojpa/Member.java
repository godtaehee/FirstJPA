package hellojpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
@Inheritance(strategy = InheritanceType.JOINED)
public class Member {

	@Id @GeneratedValue
	Long id;

	String name;

	String age;

	@OneToMany(mappedBy = "member")
	private List<MemberProduct> memberProduct = new ArrayList<>();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
