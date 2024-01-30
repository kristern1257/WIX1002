/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2016_2;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 : ");
        int num = sc.nextInt();
        while(num<0 || num>1000){
            System.out.print("Please enter a valid number betwwen 0-1000: ");
        num = sc.nextInt();
        }
        
        int sum = 0;
        while (num >0){
            sum+=(num%10);
            num/=10;
        }
        System.out.println("The sum of the digit is "+ sum);
    }
}
