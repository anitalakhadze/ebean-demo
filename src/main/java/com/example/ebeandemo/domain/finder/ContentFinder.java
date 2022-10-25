package com.example.ebeandemo.domain.finder;

import com.example.ebeandemo.domain.Content;
import io.ebean.Finder;

public class ContentFinder extends Finder<Long, Content> {

    /**
     * Construct using the default EbeanServer.
     */
    public ContentFinder() {
        super(Content.class);
    }

}
