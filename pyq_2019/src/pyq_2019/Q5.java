/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019;

public class Q5 {
    public static void main(String[] args) {
        SpecialDelivery a = new SpecialDelivery("Ali","Ahmad",4.4,false,false);
        System.out.println(a.toString());
        System.out.println("");
        
        SpecialDelivery b=new SpecialDelivery("Ah Chong","Fatimah",63.1,false,false);
        System.out.println(b.toString());
        System.out.println("");
        
        SpecialDelivery c=new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        System.out.println(c.toString());
        System.out.println(""); 
        
        SpecialDelivery d=new SpecialDelivery("Ang","Liew",19,true,true);
        System.out.println(d.toString());
        System.out.println("");
        
        double total=a.totalCost()+b.totalCost()+c.totalCost()+d.totalCost();
        System.out.println("The total shipping cost is RM "+total);
        
    }
}
