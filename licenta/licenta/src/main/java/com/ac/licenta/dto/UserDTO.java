package com.ac.licenta.dto;

public class UserDTO {
    private Long id;
    private String fullName;
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
