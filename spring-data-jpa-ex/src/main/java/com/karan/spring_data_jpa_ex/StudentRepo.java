package com.karan.spring_data_jpa_ex;

import com.karan.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  StudentRepo extends JpaRepository<Student, Integer> {//Integer is Primary key data type of student table

    @Query("select s from Student s where s.name=?1 ")  //jpa provides this query most of times you dont need to write this queries everytime
    List<Student> findByName(String name);              //it uses Query DSL Domain Specific Language

    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);




}
