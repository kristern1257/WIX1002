/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019_2;

public class Pizza {
    protected String size;
    protected int numOfCheeseTopping;
    protected int numOfBeefTopping;
    protected int numOfChickenTopping;

    public Pizza(){
        this.size=null;
        this.numOfBeefTopping=0;
        this.numOfCheeseTopping=0;
        this.numOfChickenTopping=0;
    }
    
    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    //Getters
    public String getSize() {
        return size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }
    
    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }
    
    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }
    
    //Setters
    public void setSize(String size) {
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }


    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost(){
        int totalTopping = this.numOfBeefTopping+this.numOfCheeseTopping+this.numOfChickenTopping;
        if(this.size.equalsIgnoreCase("small")){
            return 10+totalTopping*2;
        }
        else if(this.size.equalsIgnoreCase("medium")){
            return 12+totalTopping*2;
        }
        else if(this.size.equalsIgnoreCase("large")){
            return 14+totalTopping*2;
        }
        else{
            return 0;
        }
    }
    
    public void display(){
        System.out.println("Pizza size: "+getSize());
        System.out.println("Quantity of Beef Topping: "+getNumOfBeefTopping());
        System.out.println("Quantity of Cheese Topping: "+getNumOfCheeseTopping());
        System.out.println("Quantity of Chicken Topping: "+getNumOfChickenTopping());
        System.out.println("Cost: $"+computeCost());
    }
    
    
}
