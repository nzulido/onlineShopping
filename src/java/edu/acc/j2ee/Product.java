/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acc.j2ee;

import entities.Category;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;


/**
 *
 * @author nzulido
 */
public class Product implements Serializable{
    private String name;
    private BigDecimal price;
    private String description;
    private int id;
    private Blob images;
    private Category categoryId;
    private String rating;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }        

    public Blob getImages() {
        return images;
    }

    public void setImages(Blob images) {
        this.images = images;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}