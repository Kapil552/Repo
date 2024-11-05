package com.studentmgtsystem1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmgtsystem1.entity.Student;
import com.studentmgtsystem1.repository.StudentRepo;
import com.studentmgtsystem1.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {

		return studentRepo.findAll();
	}

	@Override
	public Student saveNewStudent(Student student) {

		return studentRepo.save(student);
	}

}
