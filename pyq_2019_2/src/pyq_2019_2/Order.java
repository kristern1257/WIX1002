/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019_2;


public class Order {
    
    protected String customerName;
    protected String customerID;
    protected int quantity;
    protected double unitPrice;
    
    //empty constructor
    public Order (){
        this.customerName = null;
        this.customerID = null;
        this.quantity = 0;
        this.unitPrice = 0;
    }
    
    public Order(String customerName, String customerID, int quantity, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    //Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    
    //Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double computeTotalPrice(){
        return quantity*unitPrice;
    }
    
    @Override
    public String toString(){
        String display;
        display ="\nOrder record"+"\nCustomer Name: "+ customerName+"\nCustomer ID: "+ customerID;
        display += "\nQuantity ordered:："+quantity+"\nUnit Price:："+unitPrice+"\nTotal Price:："+ computeTotalPrice();
        return display;
    }
    
    
}


