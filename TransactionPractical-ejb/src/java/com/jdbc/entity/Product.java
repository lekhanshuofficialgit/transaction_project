/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdbc.entity;

/**
 *
 * @author hppc--
 */
public class Product {
    public int id;
    public String Name;

    public Product(int i, String ram) {
        this.id=i;
        this.Name=ram;  
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}