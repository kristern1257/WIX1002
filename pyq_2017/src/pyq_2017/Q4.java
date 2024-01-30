/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2017;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First complex number ");
        System.out.print("Enter the real part : ");
        double a = sc.nextDouble();
        System.out.print("Enter the imaginary part : ");
        double b = sc.nextDouble();
        System.out.println("\nSecond complex number ");
        System.out.print("Enter the real part : ");
        double c = sc.nextDouble();
        System.out.print("Enter the real part : ");
        double d = sc.nextDouble();
        
        double []real = {a,c};
        double []imaginary = {b,d};
        
        Complex complex = new Complex();
        System.out.println("\nFirst complex number : ("+a+"+"+b+"i)");
        System.out.println("Second complex number : ("+c+"+"+d+"i)");
        
        //or 
        //if want to convert double values to int
//        int intA = (int) a;
//        int intB = (int) b;
//        int intC = (int) c;
//        int intD = (int) d;
//        System.out.println("First complex number: (" + intA + "+" + intB + "i)");
//        System.out.println("Second complex number: (" + intC + "+" + intD + "i)");

        complex.addComplexNum(real, imaginary);
        System.out.println("Addition of the two complex number:"+complex.toString());
        complex.subtractComplexNum(real, imaginary);
        System.out.println("Subtraction of the two complex number:"+complex.toString());
        
        
        
    }
    
}
