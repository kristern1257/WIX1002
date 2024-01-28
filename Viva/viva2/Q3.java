/*
A numerical value is a value which is either an integer or a decimal 
or a number that contains only one “E” or “e” with the power of an integer 
and if contains “E” or “e” the power of  “E” or “e” cannot be decimal. 
*/

package viva2;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //prompt the user to input array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter six values: ");
        String[]numbers=new String[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextLine();
        }
        printInput(numbers);
        
        //Call the method to assess numeric validity
        boolean[]result = printValidity(numbers);
        
        //Displaying the output
        for (int i=0; i<result.length;i++){
            System.out.print(result[i]);
            if(i<result.length-1)
                System.out.print(", ");
        }
        System.out.println();
    }
    
    
    public static void printInput(String[]num){
        //Print input
        System.out.print("Input: {");
        for (int i=0;i<num.length ;i++){
            System.out.print("\""+num[i]+"\",");
        }
        System.out.println("\""+num[num.length-1]+"\"}");
        
    }
    
    public static boolean[]printValidity(String[]numbers){
        boolean[]result=new boolean[numbers.length];
        
        for (int i=0;i<numbers.length;i++){
            result[i]=isValidNumeric(numbers[i]);
        }

        return result;
    }
    
    public static boolean isValidNumeric(String value){
        boolean hasDigit = false;
        boolean hasDecimal = false;
        boolean hasExponent=false;
        
        if (value == null || value.isEmpty()) {
            return false;
        }
        
        for (int j = 0; j < value.length(); j++) {
            char a = value.charAt(j);
            
            if (Character.isDigit(a)) {
                hasDigit = true;
            } 
            else if (a == '.') {
                if (hasDecimal || hasExponent) {
                    return false; // Multiple decimals are not allowed
                }
                hasDecimal = true;
            } 
            else if (a == 'e' || a == 'E') {
                // if no digit before, e at beginning, e at last, e already exist
                if (!hasDigit || j == 0 || j == value.length() - 1 || hasExponent) {
                    return false; // Incorrect placement of 'e' or 'E'
                }
                // 'e' or 'E' can only appear once and must have digits before and after it
                hasExponent=true;
            } 
            else if (a == '-' || a == '+') {
                // '-' or '+' can only appear at the start and also afer 'E' and 'e'
                if (j != 0 && (value.charAt(j - 1) != 'e' && value.charAt(j - 1) != 'E')) {
                    return false; 
                }
            } else {
                return false; // Invalid character found
            }
        }
        
        return hasDigit; // Return true if at least one digit is present
    }
}


