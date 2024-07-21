

package com.mycompany.renting_application;
import java.util.Date;

public class Renting_application {



    public static void main(String[] args) {
        Name name=new Name("AB", "cd", "FG");
        Customer customer = new Customer(name);
        
        Address nablus=new Address("pal","nab","pals");
        Building apartment = new Apartment(nablus, "neb", 5000,200,3);
        Building shop = new Shop(nablus, "Shop", 8000, 20);

        customer.rentBuilding(apartment);
        customer.rentBuilding(shop);

        

        customer.payRent(apartment, "paypal");
       
        customer.payRent(shop, "masterCard");

        Contract contract = new Contract(customer, apartment, new Date(), new Date(System.currentTimeMillis() + 2592000000L), 500.0);
        contract.displayContractDetails();
    }
}


