package dataAccess;

import entities.Instructor;

public class JdbcInstructor implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen  JDBC ile veri tabanına eklenmiştir.");
		
	}

}
