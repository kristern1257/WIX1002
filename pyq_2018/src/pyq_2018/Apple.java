/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2018;

public class Apple extends Fruit {
    //field
    private int quantity;

    //constructor
    public Apple(String name, String type, int quantity) {
        super(name, type);
        this.quantity = quantity;
    }
    
    //totalPrice method
    @Override
    public double totalPrice(){
        // Prices for Green apple and Red apple
        double greenApplePrice = 1.20;
        double redApplePrice = 1.80;

        // Calculate total price based on apple type
        if ("Green".equalsIgnoreCase(getType())) {
            return quantity * greenApplePrice;
        } else if ("Red".equalsIgnoreCase(getType())) {
            return quantity * redApplePrice;
        } else {
            // Handle unknown apple type
            System.out.println("Unknown apple type. Unable to calculate total price.");
            return 0.0;
        }
        
    }
 

    @Override
    public String toString(){
        return type+" "+name+" - "+quantity+" = RM "+totalPrice();
    }
    
    
}
    
    
