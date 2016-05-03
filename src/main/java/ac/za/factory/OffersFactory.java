package ac.za.factory;

import ac.za.domain.Offers;

import java.util.Date;
import java.util.Map;

/**
 * Created by Admin on 2016-04-29.
 */
public class OffersFactory {
    private static OffersFactory instance=null;

    private OffersFactory(){}

    public static OffersFactory getInstance() {
        if (instance == null) {
            instance = new OffersFactory();

        }
        return instance;
    }

    public static Offers createOffer(/**Map<String,Date> date**/double offerPrice,String description){
        return new Offers.Builder()
                .offerPrice(offerPrice)
                .description(description)
                //.offerStartDate(date.get("StartDate"))
               // .offerEndDate(date.get("EndDate"))
                .build();


    }
}
