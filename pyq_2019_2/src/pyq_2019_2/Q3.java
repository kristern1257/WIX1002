/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019_2;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Random r1 = new Random();
        Random r2 = new Random();
        Scanner sc = new Scanner(System.in);
        
        while (true){
        int number1 = r1.nextInt(10);
        int number2 = r2.nextInt(10);
        int sum = number1+number2;
        
        System.out.print("\nWhat is "+number1 +"+"+ number2+" ? ");
        int answer =  sc.nextInt();
        if (answer==sum){
            System.out.println(number1 +"+"+ number2+"="+answer+" is true");
        }else{
            System.out.println(number1 +"+"+ number2+"="+answer+" is false");
        }
        
        System.out.print("Do you want to try another question (y/n)? ");
        char respond = sc.next().charAt(0);
        if(respond=='n'){
            System.out.println("Program ends");
            break;
        }
        }
    }
}
