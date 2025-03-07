package com.utkarsh.net.REST_API.Repository;

import com.utkarsh.net.REST_API.Entity.Journals;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface JournalRepository extends MongoRepository<Journals, Long> {

    List<Journals> searchById(Long id);

    Journals findJournalsById(Long id);
}
