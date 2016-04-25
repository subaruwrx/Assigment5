package ac.za.factory;

import ac.za.domain.Payment;

import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class Payment_Factory {

    private static  Payment_Factory instance=null;

    private Payment_Factory(){}

    public static Payment_Factory getInstance() {
        if (instance == null) {
            instance = new Payment_Factory();

        }
        return instance;
    }

    public static Payment createPayment(Long id, Map<String,String> values,Date paid,double total) {

        Payment payment = new Payment
                .Builder(id)
                .details(values.get("details"))
                .paid(paid)
                .total(total)
                .build();
        return payment;

    }
}
