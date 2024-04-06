package com.github.vinicius015.mvc_rh.model;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address extends AbstractEntity<Long> {

    @Column(nullable = false, length = 60)
    private String neighborhood;

    @Column(nullable = false, length = 9)
    private String postalCode;

    @Column(nullable = false, length = 60)
    private String city;

    @Column(length = 60)
    private String addressLineTwo;

    @Column(nullable = false, length = 150)
    private String address;

    @Column(nullable = false, length = 60)
    private String state;

    @Column(length = 5)
    private Long number;

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }


}
