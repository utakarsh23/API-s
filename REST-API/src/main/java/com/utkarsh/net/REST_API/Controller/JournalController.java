package com.utkarsh.net.REST_API.Controller;

import com.utkarsh.net.REST_API.Entity.Journals;
import com.utkarsh.net.REST_API.Repository.JournalRepository;
import com.utkarsh.net.REST_API.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @Autowired
    private JournalRepository journalRepository;

    @PostMapping("/postJournal")
    public ResponseEntity<Journals> saveJournal(@RequestBody Journals journals) {
        return new ResponseEntity<>(journalService.createJournal(journals), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteJournal{id}")
    public ResponseEntity<Boolean> deleteJournal(@PathVariable Long id) {
        if(journalRepository.existsById(id)) {
            journalService.deleteJournal(id);
            return new ResponseEntity<>(true, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }
}
