package org.edwith.webbe.guestbook.dto;

import java.sql.Date;

public class Guestbook {
    private Long id;
    private String name;
    private String content;
    private Date regdate;

    public Guestbook(Long id, String name, String content, Date regdate) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.regdate = regdate;
    }

    public Guestbook(String name, String content) {
        this.name = name;
        this.content = content;
        this.regdate = new Date(new java.util.Date().getTime());
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegdate() {
        return this.regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "Guestbook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", regdate=" + regdate +
                '}';
    }
}
