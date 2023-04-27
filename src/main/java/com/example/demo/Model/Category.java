package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "CatID")
    private Integer CatID;

    @Column(name = "catname")
    private String CatName;

    public Category(Integer catID, String catName) {
        CatID = catID;
        CatName = catName;
    }

    public Category() {

    }

    public Integer getCatID() {
        return CatID;
    }

    public void setCatID(Integer catID) {
        CatID = catID;
    }

    public String getCatName() {
        return CatName;
    }

    public void setCatName(String catName) {
        CatName = catName;
    }
}
