package ac.za.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Created by Admin on 2016-04-12.
 */
public class LineItem implements Serializable {

    private int id;
    private int quantity;
    private double price;
    private int productID;
    private int orderNumber;
    private Date createDate;

    public LineItem() {
    }

    private LineItem(Builder build)
    {
      this.id=build.id;
      this.quantity=build.quantity;
      this.price=build.price;
      this.orderNumber=build.orderNumber;
      this.createDate=build.createDate;
      this.productID =build.productID;


    }

    public static class Builder{

        private int id;
        private int quantity;
        private double price;
        private int productID;
        private int orderNumber;
        private Date createDate;

        public Builder(int id)
        {
            this.id=id;
        }

        public Builder quantityMethod(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(double price) {
            this.quantity = quantity;
            return this;
        }

        public Builder productID(int productID) {
            this. productID =  productID;
            return this;
        }

        public Builder  purchaseOrderNumberL(int  purchaseOrderNumber)
        {
            this.orderNumber=purchaseOrderNumber;
            return this;
        }

        public Builder createDate(Date createDate) {
            this.createDate = createDate;
            return this;
        }


        public Builder copy( LineItem value) {

            this.id=value.getID();
            this.quantity=value.getQuantity();
            this.price=value.getPrice();
            this.productID=value.getProductID();
            this.orderNumber=value.getPurchaseOrderNumber();
            this.createDate=value.getCreateDate();

            return this;

        }
        public  LineItem build()
        {
            return new  LineItem(this);
        }


    }

    public int getID() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getProductID() {
        return productID;
    }

    public int getPurchaseOrderNumber() {
        return orderNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LineItem other = ( LineItem ) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Lineitem id{" + ":" + id + '}';
    }



}
