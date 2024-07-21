
package com.mycompany.renting_application;


public class Shop extends Building{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Shop(Address address, String name, int price,int size) {
        super(address, name, price);
        this.size=size;
    }

    @Override
    public String toString() {
        return super.toString()+'\n'+"shop{" + "size=" + size + '}';
    }
    @Override
    public double calculateRent() {
        return size*1000;
    }
    
    
}
