/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019;

public class Delivery {
    protected String sender;
    protected String recipient;
    protected double weight;

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    
    public double totalCost(){
        double totalCost=0.00;
        if(weight<=5){
            totalCost= weight*2.8;
        }
        else if(weight>5 && weight<=20){
            totalCost=(5*2.8)+((weight-5)*5.2);
        }
        else if(weight>20 && weight<=50){
            totalCost=(5*2.8)+(15*5.2)+((weight-20)*7);
        }
        else if(weight>50){
            totalCost=(5*2.8)+(15*5.2)+(30*7)+((weight-50)*8.6);
        }
        return totalCost;
    }
    

    @Override
    public String toString() {
        return "From : " + sender + " To : " + recipient + 
                "\nWeight of package : " + weight + " kg" +
                "\nShipping Cost : RM " + totalCost();
    }
    
    
}
