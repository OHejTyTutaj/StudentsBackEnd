package pl.tuciemam.StudentsBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tuciemam.StudentsBackEnd.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
