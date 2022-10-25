package com.example.ebeandemo.domain;

import io.ebean.Model;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import io.ebean.annotation.WhoCreated;
import io.ebean.annotation.WhoModified;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.sql.Timestamp;

@Getter
@Setter
@MappedSuperclass
public class BaseModel extends Model {

    @Id
    Long id;

    @Version
    Long version;

    @WhenCreated
    Timestamp whenCreated;

    @WhenModified
    Timestamp whenModified;

    @WhoCreated
    String whoCreated;

    @WhoModified
    String whoModified;
}
