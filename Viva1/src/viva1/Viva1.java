/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;
import java.util.Scanner;

public class Viva1 {
    public static void main(String[] args) {
        //question1//
//        System.out.println("    1    ");
//        System.out.println("   212   ");
//        System.out.println("  32123  ");
//        System.out.println(" 4321234 ");
//        System.out.println("543212345");
//
//        int n = 5;                //initialise the number of rows
//
//        for (int i = 1; i <= n; i++) {//outer loop to control the number of rows in the pattern, iterating from 1 to n (
//
//            for (int j = 1; j <= n - i; j++) {//This inner loop prints spaces BEFORE the numbers. The number of spaces decreases as you move down the rows. It prints n - i spaces in each row.
//                System.out.print(" ");
//            }
//
//            for (int j = i; j >= 1; j--) {// This loop prints the numbers in decreasing order from i to 1.
//                System.out.print(j);
//            }
//            for (int j = 2; j <= i; j++) { //This loop prints the numbers in increasing order from 2 to i.
//                System.out.print(j);
//            }
//            System.out.println();       //move to the next line in the output.
//
//        }
        
        
        //question2//
//        Scanner k = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        String integer = k.nextLine();
//        int count = integer.length();
//        System.out.print("Reversed integer: ");
//        if (integer.charAt(0)=='-'){
//            System.out.print("-");
//            for (int i=count-1; i>0; i--)   //not print index 0  becuz index 0 is '-'
//            System.out.print(integer.charAt(i)); 
//        }
//        else{
//        for (int i=count-1; i>=0; i--)   
//        System.out.print(integer.charAt(i)); 
//        }

      //queation2 extra//
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter an integer:");
//        int num=sc.nextInt();
//        System.out.print("Reversed integer:");
//        
//            if(num <0){                       //if negative 
//               System.out.print("-");         //print negative sign to indicate negative integer
//               num=-num;                      //convert negative integer to positive integer for simple reverse
//            }
//            String a = String.valueOf(num);
//            for(int i=0;i<a.length();i++){
//            System.out.print(num%10);//print  last digit
//            num=num/10;              //remove last digit
//           }
//            
//           while(num !=0){
//            System.out.print(num%10);//print  last digit
//            num=num/10;              //remove last digit
//           }
  

        //question3//
        /* Compose a program to check whether a number entered by a user is a Strong Number or not. 
        A Strong Number is a special number for which the sum of the factorials of each digit 
        is equal to the original number.*/
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter an integer : ");
//        int oriNum=sc.nextInt();
//        int num = oriNum,sum=0, digit;
//        
//        do{
//            digit = num%10;
//            int factorial = 1;
//            for(int i=1; i<=digit;i++){
//                factorial*=i;
//            }
//            sum+=factorial;
//            System.out.println(digit+"! is "+factorial);
//            num/=10;
//        }while(num>0);
//        
//        System.out.println("\nSum of factorial : "+sum);
//        if(sum==oriNum)
//            System.out.println(oriNum+" is a Strong Number.");
//        else
//            System.out.println(oriNum+" is not a Strong Number.");
        
        
        //question4//
        Scanner k = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = k.nextLine();
        
        int sumLower=0, sumUpper=0, sumSpecial=0, sumDigit=0;
        for(int i=0; i<password.length();i++){
            if(password.charAt(i)>='a' && password.charAt(i)<='z' )
                sumLower+=1;
            if(password.charAt(i)>='A' && password.charAt(i)<='Z' )
                sumUpper+=1;
            if(password.charAt(i)=='!' || password.charAt(i)=='@' || password.charAt(i)=='#'|| password.charAt(i)=='$'
                    || password.charAt(i)=='%'|| password.charAt(i)=='^'|| password.charAt(i)=='&'|| password.charAt(i)=='*'
                    || password.charAt(i)=='('|| password.charAt(i)==')'|| password.charAt(i)=='-'|| password.charAt(i)=='+')
                sumSpecial+=1;
            if(password.charAt(i)>='0'&&password.charAt(i)<='9')
                sumDigit+=1;
        }
        System.out.print("Strength of password : ");
        if(sumLower>=1 && sumUpper>=1 && sumSpecial>=1 && password.length()>=8 && sumDigit>=1)
            System.out.println("Strong");
        else if(sumLower>=1 && sumUpper>=1 && sumSpecial>=1 && password.length()>=6)
            System.out.println("Moderate");
        else
            System.out.println("Weak");
    }
}
