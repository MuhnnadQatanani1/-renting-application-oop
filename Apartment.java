
package com.mycompany.renting_application;

public class Apartment extends Building{
    private int size;
    private int numrooms;
    public Apartment(Address address, String name, int price,int size,int numrooms) {
        super(address,name,price);
        this.numrooms=numrooms;
        this.size=size;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumrooms() {
        return numrooms;
    }

    public void setNumrooms(int numrooms) {
        this.numrooms = numrooms;
    }

    @Override
    public String toString() {
        
        return super.toString()+'\n'+"Apartment{" + "size=" + size + ", numrooms=" + numrooms + '}';
    }

    @Override
    public double calculateRent() {
        return size*100;
    }
    
}
