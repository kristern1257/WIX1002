/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019_2;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter values for a, b, c : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        QuadraticEquation quad = new QuadraticEquation(a,b,c);
        System.out.println("The equation is :" +a+ "x(^2)+("+b+")x+("+c+")");
        System.out.println("Discriminant ： "+quad.Discriminant());
        
        if (quad.Discriminant()<0){
            System.out.println("The equation has no roots");
        }
        else if (quad.Discriminant()>0){
            System.out.println("The roots : "+String.format("%.2f", quad.calcRoot1())+" and "+String.format("%.2f", quad.calcRoot2()));
        }
        else if (quad.Discriminant()==0){
            System.out.println("Same roots :"+String.format("%.2f", quad.calcRoot1()));
        }
    }
}
