package com.utkarsh.net.REST_API.Service;

import com.utkarsh.net.REST_API.Entity.Journals;
import com.utkarsh.net.REST_API.Repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;


    public Journals createJournal(Journals journalContent) {
        String content = journalContent.getContent();
        journalContent.setContent(content);
        return journalRepository.save(journalContent);
    }

    public void deleteJournal(Long id) {
        if(journalRepository.existsById(id)) {
            journalRepository.deleteById(id);
        }
    }
}
