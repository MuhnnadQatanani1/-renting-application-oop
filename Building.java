
package com.mycompany.renting_application;


public abstract class Building {
    private Address address;
    private String name;
    private int price;
       public abstract double calculateRent();

    public Building(Address address,String name,int price){
        this.address=address;
        this.name=name;
        this.price=price;
    }
    public String getAddress() {
        return address.toString();
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Building{" + "address=" + address.toString() + ", name=" + name + ", price=" + price + '}';
    }
    
    

}
    