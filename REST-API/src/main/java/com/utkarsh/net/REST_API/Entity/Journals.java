package com.utkarsh.net.REST_API.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "REST-API's")
public class Journals {

    @Id
    private Long id;
    private String content;

}
