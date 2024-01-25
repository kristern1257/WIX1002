/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pyq_2016_2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number in pounds : ");
        double pounds = sc.nextDouble();
        double kilo = pounds * 0.454;
        System.out.println(pounds+ " pounds is "+kilo+" kilograms");
    }
    
}
