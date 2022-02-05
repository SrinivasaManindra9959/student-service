package com.student.studentservice.controller;

import com.google.protobuf.StringValue;
import com.student.studentservice.entities.OfferEntity;
import com.student.studentservice.entities.Student;
import com.student.studentservice.repository.OfferRepository;
import com.student.studentservice.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@Slf4j
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    OfferRepository offerRepository;

    @PostMapping(value = "/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        log.info("inside method");
        return ResponseEntity.ok(studentRepository.save(student));
    }

    @PostMapping(value = "/offer")
    public ResponseEntity<OfferEntity> createOffer(@RequestBody OfferEntity offer){
        log.info("inside method");
        offer.setId("1");
        return ResponseEntity.ok(offerRepository.save(offer));
    }

    @GetMapping(value="/offer/{id}")
    public ResponseEntity<OfferEntity> createOffer(@PathVariable String id){
        log.info("inside method");
        Optional<OfferEntity> offerEntity = offerRepository.findById(id);
        return ResponseEntity.ok(offerEntity.get());
    }
}
