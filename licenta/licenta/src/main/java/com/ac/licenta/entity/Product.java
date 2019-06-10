package com.ac.licenta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "ac_product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;

    @NotNull
    @Column(unique = true)
    private String rfid;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(final String rfid) {
        this.rfid = rfid;
    }
}
