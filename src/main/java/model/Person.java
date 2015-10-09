package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import model.Email;
import model.Gender;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexggg99 on 11.08.15.
 */

@Entity
@Table(name = "PERSONS")
public class Person implements Serializable{

    public Person() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @JsonProperty(value = "id")
    private long id;

    @Column(name = "AGE")
    @JsonProperty(value = "age")
    private int age;

    @Enumerated
    @JsonProperty(value = "gender")
    private Gender gender;

    @Column(name = "NAME")
    @JsonProperty(value = "name")
    private String name;

    @Column(name = "NICKNAME")
    @JsonProperty(value = "nickname")
    private String nickname;

    @Column(name = "PASSWORD")
    @JsonProperty(value = "password")
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "personFrom")
    @JsonIgnore
    private List<Email> personFromList = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "personTo")
    @JsonIgnore
    private List<Email> personToList = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Email> getPersonFromList() {
        return personFromList;
    }

    public void setPersonFromList(List<Email> personFromList) {
        this.personFromList = personFromList;
    }

    public List<Email> getPersonToList() {
        return personToList;
    }

    public void setPersonToList(List<Email> personToList) {
        this.personToList = personToList;
    }
}
