package com.example.ebeandemo.domain.repo;

import com.example.ebeandemo.domain.Content;
import io.ebean.Database;
import org.springframework.beans.factory.annotation.Autowired;

public class ContentRepository extends BeanRepository<Long, Content> {

    @Autowired
    public ContentRepository(Database database) {
        super(Content.class, database);
    }

}
