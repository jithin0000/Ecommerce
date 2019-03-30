package com.jithin.Ecommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Orders {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderNumber;

    private Date orderDate;
    private Date requiredDate;
    private int salesTax;

    private boolean isFulfilled;
    private boolean isPaid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public int getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(int salesTax) {
        this.salesTax = salesTax;
    }

    public boolean isFulfilled() {
        return isFulfilled;
    }

    public void setFulfilled(boolean fulfilled) {
        isFulfilled = fulfilled;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return salesTax == orders.salesTax &&
                isFulfilled == orders.isFulfilled &&
                isPaid == orders.isPaid &&
                id.equals(orders.id) &&
                orderNumber.equals(orders.orderNumber) &&
                orderDate.equals(orders.orderDate) &&
                requiredDate.equals(orders.requiredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNumber, orderDate, requiredDate, salesTax, isFulfilled, isPaid);
    }
}
