package com.example.uaharoni.tourtheplace.model;

/**
 * Created by udi on 13/06/2016.
 */
public class Place {
    String name;
    Address address;
    Long id; // used for DB saving

    public Place(String name, Address address, Long id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
