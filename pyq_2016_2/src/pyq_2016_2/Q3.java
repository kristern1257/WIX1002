/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2016_2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines (1-15): ");
        int num = sc.nextInt();
        
        for (int i=1; i<=num; i++){
            //print black space before the numbers
            for (int j=i; j<num ; j++){
                System.out.print(" ");
            }
            
            //print num until 1 in descending order
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            
            //print num after 1 in ascending order
            for(int j=2;j<=i; j++){
                System.out.print(j);
            }
            
            System.out.println("");
        }
    }
}


//public class Q3 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number of lines : ");
//        int a=sc.nextInt();
//        int test=(a*2-1)+6;
//        for(int i=0;i<a;i++){
//            System.out.printf("%"+(a-i)+"s", "");
//            System.out.print((i+1)+"");
//            int j=i;
//            while(j>0){
//                System.out.print(j+"");
//                j--;
//            }
//            while(j!=i){
//                System.out.print(j+2+"");
//                j++;
//            }
//            System.out.println("");
//        }
//    }
//   
//}