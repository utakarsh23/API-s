package com.utkarsh.net.REST_API.Controller;

import com.utkarsh.net.REST_API.Entity.Journals;
import com.utkarsh.net.REST_API.Service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private JournalService journalService;


    @PostMapping("/postJournal")
    public ResponseEntity<Journals> saveJournal(@RequestBody Journals journals) {
        return new ResponseEntity<>(journalService.createJournal(journals), HttpStatus.CREATED);
    }
}
