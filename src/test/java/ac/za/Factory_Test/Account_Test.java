package ac.za.factory_Test;

import ac.za.domain.Account;
import ac.za.domain.Address;
import ac.za.factory.Account_Factory;
import junit.framework.Assert;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;


public class Account_Test {
    Long id=100000L;
    Address address;
    Date date;
    boolean closed=true;
    @Before
    public void setUp() throws Exception {


    }

    @org.junit.Test
    public void testCreateEvent() throws Exception {

        Map<String, String> values = new HashMap<String, String>();

        values.put("accountNumber", "1000093090");





        Account account = Account_Factory
                .createAccount(id,address,values,date,closed);

        Assert.assertEquals("1000093090", account.getId());
    }
}
