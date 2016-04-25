package ac.za.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by Admin on 2016-04-12.
 */
public class Order implements Serializable {

    private int orderNumber;
    public List<LineItem> lineItems;
    public Date purchaseOrderDate;
    public Date deliveryDate;
    private int supplierID;
    private int lineItemCount;
    private String supplierName;
    private List<Product> myproducts;

    public Order(){


    }

    private Order(Builder build){
        this.orderNumber=build.orderNumber;
        this.lineItems=build.lineItems;
        this.purchaseOrderDate=build.purchaseOrderDate;
        this.deliveryDate=build.deliveryDate;
        this.supplierID=build.supplierID;
        this.lineItemCount=build.lineItemCount;
        this.supplierName=build.supplierName;

    }


    public static class Builder{

        private int orderNumber;
        public List<LineItem> lineItems;
        public Date purchaseOrderDate;
        public Date deliveryDate;
        private int supplierID;
        private int lineItemCount;
        private String supplierName;

        public Builder(int orderNumber){
            this.orderNumber=orderNumber;
        }

        public Builder lineItems( List<LineItem> lineItems){
            this.lineItems=lineItems;
            return this;
        }


        public Builder orderDate(Date purchaseOrderDate ){
            this.purchaseOrderDate=purchaseOrderDate;
            return this;
        }

        public Builder deliveryDate(Date deliveryDate){
            this.deliveryDate=deliveryDate;
            return this;
        }


        public Builder supplierId(int supplierID)
        {
            this.supplierID=supplierID;
            return this;
        }

        public Builder lineItemCount(int lineItemCount)
        {
            this.lineItemCount=lineItemCount;
            return this;

        }

        public Builder supplierName(String supplierName)
        {
            this.supplierName=supplierName;
            return this;

        }

        public Builder copy(Order value) {
            this.orderNumber=value.getOrderNumber();
            this.lineItems=value.getLineItems();
            this.purchaseOrderDate=value.getPurchaseOrderDate();
            this.deliveryDate=value.getDeliveryDate();
            this.supplierID=value.getSupplierID();
            this.supplierName=value.getSupplierName();
            this.lineItemCount=value.getLineItemCount();


            return this;

        }
        public Order build()
        {
            return new Order(this);
        }


    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public Date getPurchaseOrderDate() {
        return purchaseOrderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public int getLineItemCount() {
        return lineItemCount;
    }

    public String getSupplierName() {
        return supplierName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = ( Order ) obj;
        if (!Objects.equals(this.orderNumber, other.orderNumber)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Oder id{" + ":" + orderNumber+ '}';
    }
}
