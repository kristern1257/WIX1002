/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019_2;

public class ShippedOrder extends Order{
    
    public double computeTotalPrice(){
        return quantity*unitPrice +4;
    }
    
    public ShippedOrder(String customerName, String customerID, int quantity, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    @Override
    public String toString(){
        String display;
        display ="\nShipped"+"\nOrder record"+"\nCustomer Name: "+ customerName+"\nCustomer ID: "+ customerID;
        display += "\nQuantity ordered:："+quantity+"\nUnit Price:："+unitPrice+"\nTotal Price:："+ computeTotalPrice();
        return display;
    }
}
