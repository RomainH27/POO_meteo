package TP1.TP1_note_dm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@Entity
public class Address {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;

    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Date getCreation() {
        return creation;
    }

    public String getContent() {
        return content;
    }

}