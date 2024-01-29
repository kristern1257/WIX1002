/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019;

public class SpecialDelivery extends Delivery {
    protected boolean weekend;
    protected boolean night;

    public SpecialDelivery(String sender, String recipient, double weight, boolean weekend, boolean night) {
        super(sender, recipient, weight);
        this.weekend = weekend;
        this.night = night;
    }
    
    @Override
    public double totalCost(){
       if(weekend&&night){
           return (super.totalCost()+50)*1.2;
       }
       else if(weekend){
           return super.totalCost()+50;
       }
       else if(night){
           return super.totalCost()*1.2;
       }
       else{
           return super.totalCost();
       }  
    }

    @Override
    public String toString(){
        String temp="From : "+this.sender+" To: "+this.recipient+
                    "\nWeight of Package : "+this.weight+" kg"+
                    "\nShipping Cost : RM"+ this.totalCost();
        if(weekend){
            temp+="\nWeekend Delivery";
        }
        if(night){
            temp+="\nNight Time Delivery";
        }
        return temp;
    }
    
    
    
}
