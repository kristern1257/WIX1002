/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2018;

public class Watermelon extends Fruit {
   
    public double weight;
    
    public Watermelon(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }
    
    @Override
    public double totalPrice(){
        // Calculate total price based on type and weight
        if ("Local".equalsIgnoreCase(getType())) {
            if (weight < 2){
              return weight * 2.25;  
            }else if(weight >= 2 && weight <=5){
                return weight * 1.95;
            }else if (weight >5){
                return weight * 1.65;
            }
            
        } else if ("Imported".equalsIgnoreCase(getType())) {
            if (weight < 2){
              return weight * 3.75;  
            }else if(weight >= 2 && weight <=5){
                return weight * 3.45;
            }else if (weight >5){
                return weight * 3.15;
            }
        } else {
            // Handle unknown type
            System.out.println("Unknown watermelon type. Unable to calculate total price.");
            return 0.0;
        }
        return 0;
    }
    
    
    @Override
    public String toString(){
        return type+" "+name+" - "+weight+"kg = RM "+totalPrice();
    }
    
}
