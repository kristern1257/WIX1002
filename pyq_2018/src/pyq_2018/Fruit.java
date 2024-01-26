/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2018;

public abstract class Fruit {
    //fields
    protected String name;
    protected String type;
    
    //constructor
    public Fruit (String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    //Abstract method
    public abstract double totalPrice();
    
    //toString method
    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", type=" + type + '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}

