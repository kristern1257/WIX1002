/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: "); 
        String password = sc.nextLine();

        boolean isValid = isValidPassword(password);// calling method
        if(isValid==true)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    public static boolean isValidPassword(String password) {
        int lower=0;
        int upper=0;
        int digit=0;
        int special=0;
        for(int i=0; i<password.length();i++){
        char a = password.charAt(i);
        if(Character.isLowerCase(a))
            lower++;
        if(Character.isUpperCase(a))
            upper++;
        if(Character.isDigit(a))
            digit++;
        if(!Character.isLowerCase(a)&&!Character.isUpperCase(a)&&!Character.isDigit(a))
            special++;
    }
        if(password.length()>=8 && upper>=1 &&lower>=1 && digit>=3 && special==1)
            return true;
        else
            return false;
        
    }
}

//public class Q1 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your password: "); 
//        String password = sc.nextLine();
//
//        boolean isValid = isValidPassword(password);// calling method
//
//        String message = isValid ? "true" : "false";
//        System.out.println(message);
//    }
//
//    public static boolean isValidPassword(String password) {
//        if (password.length() < 8) {
//            return false;
//        }
//        else{
//        boolean hasUpperCase = false;
//        boolean hasLowerCase = false;
//        int digitCount = 0;
//        int specialCharCount = 0;
//
//        for (char ch : password.toCharArray()) {  //go through each character in the password string.
//            if (Character.isUpperCase(ch)) {
//                hasUpperCase = true;
//            } else if (Character.isLowerCase(ch)) {
//                hasLowerCase = true;
//            } else if (Character.isDigit(ch)) {
//                digitCount++;
//            } else if (isSpecialCharacter(ch)) {
//                specialCharCount++;
//            }
//        }
//        return hasUpperCase && hasLowerCase && digitCount >= 3 && specialCharCount == 1;
//    }
//    }
//
//    private static boolean isSpecialCharacter(char ch) {
//        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
//        return specialCharacters.contains(String.valueOf(ch));
//    }
//}
