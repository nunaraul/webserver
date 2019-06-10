package com.ac.licenta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "ac_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String fullName;

    @NotNull
    @Column(unique = true)
    private String rfid;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(final String rfid) {
        this.rfid = rfid;
    }
}
