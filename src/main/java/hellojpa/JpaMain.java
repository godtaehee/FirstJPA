package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();


		for (int i = 0; i < 5; i++) {
			Student student = new Student();

			student.setName("dsafas");
			student.setAge("sdafsa");
			student.setStudent("asdfasd");

			em.persist(student);
		}


		for (int i = 0; i < 5; i++) {
			Teacher teacher = new Teacher();

			teacher.setTeacher("dsaf");

			teacher.setName("dsafas");

			teacher.setAge("asfasd");

			em.persist(teacher);
		}


		tx.commit();

		em.close();
		emf.close();
	}
}
