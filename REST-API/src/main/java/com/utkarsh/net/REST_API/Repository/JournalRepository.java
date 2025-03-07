package com.utkarsh.net.REST_API.Repository;

import com.utkarsh.net.REST_API.Entity.Journals;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<Journals, Long> {

}
