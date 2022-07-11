package com.tundeadetunji.blogsapi.business.models;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String uuid = UUID.randomUUID().toString();

    @Column(nullable = false, length = 50)
    private String category;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 255)
    private String author;

    @Column(nullable = false)
    private String published = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(System.currentTimeMillis()));

    @Column(nullable = false)
    private String lastModified = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date(System.currentTimeMillis()));

    @Column(nullable = false, length = 4000)
    private String content;

    @Column(nullable = false, length = 4000)
    private String contentLead;

//    public Blog() {
//    }

//    public Blog(Long id, String uuid, String category, String title, String author, String published, String lastModified, String content, String contentLead) {
//        this.id = id;
//        this.uuid = uuid;
//        this.category = category;
//        this.title = title;
//        this.author = author;
//        this.published = published;
//        this.lastModified = lastModified;
//        this.content = content;
//        this.contentLead = contentLead;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getContent() {
        return content;
    }

    public String getContentLead() {
        return contentLead;
    }

    public void setContentLead(String contentLead) {
        this.contentLead = contentLead;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
