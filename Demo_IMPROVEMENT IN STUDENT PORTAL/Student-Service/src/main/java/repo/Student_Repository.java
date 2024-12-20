package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Student;

@Repository
public interface Student_Repository extends JpaRepository<Student, Long>{

}
