/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2018;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N number: ");
        int N = sc.nextInt();
        
        System.out.print("\nThe random numbers are : ");
        Random r =new Random();
        int [] num = new int [N];
        final int MIN=50;
        final int MAX=150;
        int countAAA=0, countAA=0, countA=0;
        for (int i=0; i<num.length-1; i++){
            num[i]= r.nextInt(MAX+1)+MIN;
            System.out.print(num[i] + " ");
            
            int lastDigit= num[i]%10;
            if (lastDigit<=3){
                countAAA+=1;
            }else if(lastDigit>3&&lastDigit<=6){
                countAA+=1;
            }else if(lastDigit>6&&lastDigit<=9){
                countA+=1;}
            }
        System.out.println("\nGroup AAA : "+ countAAA);
        System.out.println("Group AA : "+ countAA);
        System.out.println("Group A : "+ countA);
        
    }
}
