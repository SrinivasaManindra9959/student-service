package com.student.studentservice.repository;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.student.studentservice.entities.OfferEntity;

public interface OfferRepository extends DatastoreRepository<OfferEntity,String> {
}
