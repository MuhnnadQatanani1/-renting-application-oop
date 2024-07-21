
package com.mycompany.renting_application;
//aggregation

class Address {
    private String street;
    private String City;
    private String contry;

    public Address(String street, String City, String contry) {
        this.street = street;
        this.City = City;
        this.contry = contry;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + ", City=" + City + ", contry=" + contry + '}';
    }
    
}
