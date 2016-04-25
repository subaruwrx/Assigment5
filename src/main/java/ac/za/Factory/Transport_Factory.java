package ac.za.factory;

import ac.za.domain.Transport;

import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class Transport_Factory {

    private static Transport_Factory instance=null;

    private Transport_Factory(){}

    public static Transport_Factory getInstance() {
        if (instance == null) {
            instance = new Transport_Factory();

        }
        return instance;
    }

    public static Transport createTransport(Map<String,String> values) {
        Transport transport= new Transport
                .Builder(values.get("id"))
                .availableMethod(values.get("available"))
                .locationMethod(values.get("location"))
                .rootMethod(values.get("root ot travel"))
                .transportType(values.get("Bus"))
                .build();
        return transport;

    }
}
