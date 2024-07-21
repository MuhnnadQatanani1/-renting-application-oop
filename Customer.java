
package com.mycompany.renting_application;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Name name;
    private List<Building> rentedBuildings;
   

    public Customer(Name name) {
        this.name = name;
        this.rentedBuildings = new ArrayList<>();

    }

  
    
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<Building> getRentedBuildings() {
        return rentedBuildings;
    }

  
    

    public void rentBuilding(Building building) {
        rentedBuildings.add(building);
    }

    public void payRent(Building building, String paymentMethod) {
        double rentAmount = building.calculateRent();
        System.out.print("payment Method is"+paymentMethod+"rent"+rentAmount);
    }

    
}
