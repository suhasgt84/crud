package com.app.crud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.crud.entities.Student;
import com.app.crud.repositories.Studentrepository;

@SpringBootTest
class CrudApplicationTests {


@Autowired
private Studentrepository studentrepo;


@Test

public void add() {
	Student s=new Student();
	s.setName("suhas");
	s.setCourse("shat");
	s.setFee(350);
	studentrepo.save(s);
	
}
	
	

}
