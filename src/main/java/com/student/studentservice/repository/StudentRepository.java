package com.student.studentservice.repository;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.student.studentservice.entities.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends DatastoreRepository<Student,Long> {

}
