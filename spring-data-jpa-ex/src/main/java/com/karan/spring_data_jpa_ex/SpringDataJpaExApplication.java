package com.karan.spring_data_jpa_ex;

import com.karan.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Karan");
//		s1.setMarks(95);
//
//		s2.setRollNo(102);
//		s2.setName("Omkar");
//		s2.setMarks(85);
//
//		s3.setRollNo(103);
//		s3.setName("Satyam");
//		s3.setMarks(75);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		Optional<Student> s =repo.findById(104);
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findByName("Karan"));
//		System.out.println(repo.findByMarks(85));
//		System.out.println(repo.findByMarksGreaterThan(70));

		//Save is also used for update operation
		//repo.delete(s2);

	}


}
