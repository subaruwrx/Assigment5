package ac.za.factory;

import ac.za.domain.Account;
import ac.za.domain.Address;

import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 2016-04-14.
 */
public class Account_Factory {


    private static Account_Factory instance=null;

    private Account_Factory(){}

    public static Account_Factory getInstance() {
        if (instance == null) {
            instance = new Account_Factory();

        }
        return instance;
    }
    public static Account createAccount(Long id, Address address, Map<String, String> values, Date date,boolean closed)
    {


        Account account =  new Account
                .Builder(id)
                .accountNumber(values.get("accountNumber"))
                .addressAccount(address)
                .open(date)
                .is_Closed(closed)
                .closed(date)
                .build();
        return account;
    }
}
