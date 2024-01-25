/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019_2;

public class QuadraticEquation {
    private int a,b,c;
    
    //Constructor
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public double Discriminant(){
        return (this.b*this.b)-4*this.a*this.c;
        //return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    
    public double calcRoot1(){
        if (Discriminant()>=0){
        return -(this.b)+ Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)/(2*this.a);
        } else{
            return 0;
        }
    }
    
    public double calcRoot2(){
        if (Discriminant()>=0){
        return -(this.b)- Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)/(2*this.a);
        } else{
            return 0;
        }
    }
    
}
