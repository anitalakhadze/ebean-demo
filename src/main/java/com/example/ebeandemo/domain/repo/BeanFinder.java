package com.example.ebeandemo.domain.repo;

import io.ebean.Database;
import io.ebean.Finder;

public abstract class BeanFinder<I,T> extends Finder<I,T> {
    protected final Database database;

    public BeanFinder(Class<T> type, Database database) {
        super(type);
        this.database = database;
    }

    @Override
    public Database db() {
        return database;
    }
}