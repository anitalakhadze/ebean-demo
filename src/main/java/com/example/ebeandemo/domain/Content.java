package com.example.ebeandemo.domain;

import com.example.ebeandemo.domain.finder.ContentFinder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="content")
public class Content extends BaseModel {

    public static final ContentFinder find = new ContentFinder();

    String name;
}