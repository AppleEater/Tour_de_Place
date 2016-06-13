package com.example.uaharoni.tourtheplace.model;

/**
 * Created by udi on 13/06/2016.
 */
public class Address {
    Long addLat, addLong;
    String name;

    public Address(String name, Long addLat, Long addLong) {
        this.name = name;
        this.addLat = addLat;
        this.addLong = addLong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAddLong() {
        return addLong;
    }

    public void setAddLong(Long addLong) {
        this.addLong = addLong;
    }

    public Long getAddLat() {
        return addLat;
    }

    public void setAddLat(Long addLat) {
        this.addLat = addLat;
    }
}
