package com.ithome.presistence.beans;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "biz_article_with_blobs")
public class BizArticleWithBLOBs extends BizArticle {

    @Column(name = "content")
    private String content;


    @Column(name = "content_md")
    private Long content_md;
}
