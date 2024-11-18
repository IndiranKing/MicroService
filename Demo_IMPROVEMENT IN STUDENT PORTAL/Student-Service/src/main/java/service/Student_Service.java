package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Student;
import repo.Student_Repository;

@Service
public class Student_Service {
	@Autowired
    private Student_Repository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
}

