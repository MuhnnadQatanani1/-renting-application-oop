
package com.mycompany.renting_application;import java.util.Date;


public class Contract {
    private Customer customer;
    private Building building;
    private Date startDate;
    private Date endDate;
    private double price;

    public Contract(Customer customer, Building building, Date startDate, Date endDate, double price) {
        this.customer = customer;
        this.building = building;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public void displayContractDetails() {
        System.out.println("Contract Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Building: " + building.getName() + " (" + building.getAddress() + ")");
        System.out.println("Rental Period: " + startDate + " to " + endDate);
        System.out.println("Price: " + price);
    }

    // Getters and Setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
