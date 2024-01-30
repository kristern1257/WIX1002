/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2017;
import java.util.Random;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q3 {
    public static void main(String[] args) {
        generateString();
        String oriString = readString();
        System.out.println("The String generated is : " + oriString);
        
        //convert the string to char array for sorting
        char[]stringArray=oriString.toCharArray();
        
        //sort in ascending order
        bubbleSort(stringArray,'>');
        String ascArray=new String(stringArray);
        System.out.println("String sorted in ascending order is: " + ascArray);
        
        //sort in descending order
        bubbleSort(stringArray,'<');
        String dscArray=new String(stringArray);
        System.out.println("String sorted in descending order is: " + dscArray);
        
        System.out.println("Original string from file : " + oriString);
    }
    
    private static void generateString(){
        try{
            PrintWriter out = new PrintWriter (new FileOutputStream ("data.txt"));
            StringBuilder sb = new StringBuilder();
            Random r = new Random();
            
            for(int i=0; i<6; i++){
                char string = (char)(r.nextInt(90-65+1)+65);//ASCII codes for uppercase letters ('A' to 'Z')
                if(r.nextBoolean()){ // random decide, if true the char is convert to lowercase
                    string = Character.toLowerCase(string);
                } sb.append(string);
            }
            out.println(sb);
            out.close();
            
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
    
    private static String readString(){
        StringBuilder sb = new StringBuilder();
       try {
           Scanner in = new Scanner(new FileInputStream("data.txt"));
           while (in.hasNextLine()){
               sb.append(in.nextLine());
           }
           in.close();
       } catch (FileNotFoundException e){
           System.out.println("File was not found.");
       }
       return sb.toString();
    }
    
    private static void bubbleSort(char[]arr, char mode){
        int n = arr.length;
        for(int pass=0; pass<n; pass++){
            for(int i=0; i<n-1; i++){
            if ((mode == '>' && arr[i]>arr[i+1]) || (mode == '<' && arr[i]<arr[i+1])){
                // swap arr[i] and arr[i+1]
                char temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            }
        }
    }
}
