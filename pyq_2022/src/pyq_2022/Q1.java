/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2022;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.print("3 random price values : ");
        for(int i =0; i<3; i++){
            double price = r.nextDouble(201)+100;
            System.out.printf("%.2f\t", price);
        }
        
        
        System.out.print("\n5 random even-numbered years : ");
        for(int i =0; i<5; i++){
            int year = r.nextInt(41)+1990;
            if (year%2==0){
                System.out.print(year+" ");
            }
        }
        
        System.out.print("\nCar Plate Number : ");
        String plate = new String();
        for(int i=0;i<7;i++){
            int num = r.nextInt(10);
            if(i<5){
                plate+=num;
            }
            else{
                char letter = (char) (r.nextInt(26) + 'A');
                plate+=(letter);
                
                // char c = 'Z';
                // plate+=((char)(c-xx.nextInt(26)));
            }
        }
        System.out.print(plate);
        
        
        System.out.print("\nRandom Word :");
        String word = new String();
        int length= r.nextInt(8)+1;     //word length 1-8
        for(int i =0; i<length; i++){
            boolean or;             // random whether want uppercase or lower case letter
            if((r.nextInt(2)+1)%2==0){  //2
                or = true;
            }
            else                        //1
                or = false;
            
            char c = 'Z';
            if(or==true){
                word +=((char)(c-r.nextInt(26)));
            }
            else{
                word +=((char)(Character.toLowerCase(c)-r.nextInt(26)));
            }
        }
            System.out.println(word);
    }
    
}
