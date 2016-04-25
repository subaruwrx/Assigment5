package ac.za.factory;

import ac.za.domain.Address;
import ac.za.domain.Customer;

import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class Customer_Factory {

    private static  Customer_Factory instance=null;

    private Customer_Factory(){}

    public static Customer_Factory getInstance() {
        if (instance == null) {
            instance = new Customer_Factory();

        }
        return instance;
    }

    public static Customer createCustomer( Map<String,String> values, Address address) {

        Customer cust = new Customer.Builder()
                .custNumber(values.get("customerNumber"))
                .custName(values.get("custName"))
                .custSurname(values.get("custSurname"))
                .Address(address)
                .build();
        return cust;

    }
}
