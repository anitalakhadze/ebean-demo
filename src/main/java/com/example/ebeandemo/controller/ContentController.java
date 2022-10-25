package com.example.ebeandemo.controller;

import com.example.ebeandemo.domain.Content;
import com.example.ebeandemo.domain.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @GetMapping
    public List<Content> getContent() {
        return contentService.getContent();
    }

    @PostMapping
    public Content add(@RequestBody Content content) {
        return contentService.save(content);
    }
}
