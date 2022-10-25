package com.example.ebeandemo.domain.service;

import com.example.ebeandemo.domain.Content;
import io.ebean.Database;
import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    @Autowired
    Database database;

    public List<Content> getContent() {
        return database
                .find(Content.class)
                .findList();
    }

    @Transactional
    public Content save(Content content) {
        database.save(content);
        if (content.getName().equals("rollback")) {
            throw new RuntimeException("Boom!");
        }
        return content;
    }
}
