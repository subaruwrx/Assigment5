package ac.za.factory;

import ac.za.domain.Address;

import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class Address_Factory {



    private static Address_Factory instance=null;

    private Address_Factory(){}

    public static Address_Factory getInstance() {
        if (instance == null) {
            instance = new Address_Factory();

        }
        return instance;
    }



    public static Address createAddress(Map<String,String> values) {
        Address address= new Address
                .Builder(values.get("city"))
                .country(values.get("country"))
                .Street(values.get("street"))
                .build();
        return address;

    }


}
