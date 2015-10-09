package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import model.Email;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 26.09.2015.
 */
@Entity
@Table(name = "PRIORITY")
public class Priority {

    public Priority() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @JsonProperty(value = "id")
    private long id;

    @Column(name = "NAME")
    @JsonProperty(value = "name")
    private String name;

    @Column(name = "PRIORITY")
    @JsonProperty(value = "priority")
    private int priority;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "priority")
    @JsonIgnore
    private List<Email> emailList = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public List<Email> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<Email> emailList) {
        this.emailList = emailList;
    }
}
