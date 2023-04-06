package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @Column(name = "CourID")
    private Integer id;

    @Column(name = "courname")
    private String name;

    private LocalDate dob;
    private LocalDate update;
    private String Fulldes;
    private String TinyDes;
    private Long price;
    private Integer CatID;
    private Integer TeacherID;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFulldes() {
        return Fulldes;
    }

    public void setFulldes(String fulldes) {
        Fulldes = fulldes;
    }

    public String getTinyDes() {
        return TinyDes;
    }

    public void setTinyDes(String tinyDes) {
        TinyDes = tinyDes;
    }

    public void setCatID(Integer catID) {
        CatID = catID;
    }

    public void setTeacherID(Integer teacherID) {
        TeacherID = teacherID;
    }

    public Course(Integer id, String name, LocalDate dob, LocalDate update, String fulldes, String tinyDes, Long price, Integer catID, Integer teacherID) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.update = update;
        Fulldes = fulldes;
        TinyDes = tinyDes;
        this.price = price;
        CatID = catID;
        TeacherID = teacherID;
    }

    public Course() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getUpdate() {
        return update;
    }

    public void setUpdate(LocalDate update) {
        this.update = update;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getCatID() {
        return CatID;
    }

    public void setCatID(int catID) {
        CatID = catID;
    }

    public int getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(int teacherID) {
        TeacherID = teacherID;
    }
}
