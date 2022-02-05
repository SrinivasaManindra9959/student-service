package com.student.studentservice.entities;

import com.google.cloud.spring.autoconfigure.datastore.DatastoreNamespaceProvider;
import com.google.cloud.spring.data.datastore.core.mapping.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    Long id;
    String name;
    String rollNumber;
}
