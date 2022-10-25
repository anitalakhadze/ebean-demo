package com.example.ebeandemo.domain.service;

import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.config.DatabaseConfig;
import io.ebean.datasource.DataSourceConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration implements FactoryBean<Database> {

    @Value("${datasource.db.username}")
    private String username;

    @Value("${datasource.db.password}")
    private String password;

    @Value("${datasource.db.databaseUrl}")
    private String url;

    @Value("${datasource.db.databaseDriver}")
    private String driver;

    @Autowired
    CurrentUser currentUser;

    @Override
    public Database getObject() throws Exception {
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUsername(username);
        dataSourceConfig.setPassword(password);
        dataSourceConfig.setUrl(url);
        dataSourceConfig.setDriver(driver);

        DatabaseConfig config = new DatabaseConfig();
        config.setDataSourceConfig(dataSourceConfig);
        config.setCurrentUserProvider(currentUser);

        return DatabaseFactory.create(config);    }

    @Override
    public Class<?> getObjectType() {
        return Database.class;
    }
}
