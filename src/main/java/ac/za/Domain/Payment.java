package ac.za.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Admin on 2016-04-13.
 */
public class Payment implements Serializable {

    private Long id;
    private Date paid;
    private double total;
    private String details;


    private Payment(){

    }

    private Payment(Builder build){

    }

    public static class Builder{
        private Long id;
        private Date paid;
        private double total;
        private String details;


        public Builder(Long id){
            this.id=id;
        }

        public Builder paid(Date paid){
            this.paid=paid;
            return this;
        }

        public Builder total(double total){
            this.total=total;
            return this;
        }

        public Builder details(String details)
        {
            this.details=details;
            return this;
        }

        public Builder copy(Payment value) {
            this.id=value.getId();
            this.details=value.getDetails();
            this.paid=value.getPaid();
            this.total=value.getTotal();

            return this;

        }
        public Payment build()
        {
            return new Payment(this);
        }




    }

    public Long getId() {
        return id;
    }

    public Date getPaid() {
        return paid;
    }

    public double getTotal() {
        return total;
    }

    public String getDetails() {
        return details;
    }
}
