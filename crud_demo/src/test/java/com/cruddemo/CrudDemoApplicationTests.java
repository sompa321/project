package com.cruddemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entities.Student;
import com.cruddemo.repository.StudentRepository;

@SpringBootTest  
class CrudDemoApplicationTests {
 @Autowired
private StudentRepository studentRepo;
	@Test
	void saveOneStudent() {
		//System.out.println(studentRepo);
		Student s = new Student();
		s.setCourse("development");
		s.setFee(10000);
		s.setName("sompa");
		studentRepo.save(s);
	}

}
