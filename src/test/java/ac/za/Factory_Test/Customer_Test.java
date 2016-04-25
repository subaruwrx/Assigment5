package ac.za.factory_Test;

import ac.za.domain.Address;
import ac.za.domain.Customer;
import ac.za.factory.Address_Factory;
import ac.za.factory.Customer_Factory;
import junit.framework.Assert;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by Admin on 2016-04-19.
 */
public class Customer_Test {

    @Test
    public void testCreateCustomer() throws Exception {



        Map<String,String> values = new HashMap<String, String>();

        Map<String,String> values1= new HashMap<String, String>();

        //Address

        values1.put("city","cape town");
        values1.put("country", "South Africa");
        values1.put("street","24 tienkers road");


        Address address = Address_Factory
                .createAddress(values1);


        //customer
        values.put("customerNumber","Smi650309");
        values.put("custName", "Smith");
        values.put("custSurname","John");


        Customer customer =  Customer_Factory
                .createCustomer(values,address);

        Assert.assertEquals("cape town",address.getCity());
        Assert.assertEquals("South Africa",address.getCountry());
        Assert.assertEquals("24 tienkers road",address.getStreet());


        Assert.assertEquals("Smi650309", customer.getCustNumber());
        Assert.assertEquals("Smith",customer.getCustName());
        Assert.assertEquals("John",customer.getCustSurname());
    }

    @Test
    public void testUpdateCustomer() throws Exception {

        final String number="Dik093877";
        final String customerNam="Sibabalwe";
        final String custSurname="Dike";

        final String country="South america";
        Map<String,String> values = new HashMap<String, String>();
        Map<String,String> values1 = new HashMap<String, String>();
        ///Address
        values.put("city","cape town");
        values.put("country", "South Africa");
        values.put("street","24 tienkers road");

        //Customer
        values1.put("customerNumber","Smi650309");
        values1.put("custName", "Smith");
        values1.put("custSurname","John");

        Address adress = Address_Factory
                .createAddress(values);

        Address address1= new Address
                .Builder("joburg")
                //.copy(adress)
                .country(country)
                .Street("14 caledon street")
                .build();

        Customer customer =Customer_Factory
                .createCustomer(values1,adress);



        Customer customer1=new Customer
                .Builder()
                .copy(customer)
                .Address(address1)
                .custNumber(number)
                .custName(customerNam)
                .custSurname(custSurname)
                .build();



        Assert.assertEquals(number,customer1.getCustNumber());
        Assert.assertEquals( custSurname,customer1.getCustSurname());
        Assert.assertEquals(customerNam,customer1.getCustName());

        Assert.assertEquals("joburg", address1.getCity());
        Assert.assertEquals(country,address1.getCountry());
        Assert.assertEquals("14 caledon street",address1.getStreet());

    }

}
