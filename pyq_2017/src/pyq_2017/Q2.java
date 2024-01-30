/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2017;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial fee (i.e year 1): ");
        double fee = sc.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate = sc.nextDouble()/100;
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = sc.nextInt();
        System.out.printf("\nCompueted tuition fee for year "+year+" is: %.2f",computeFee(fee, rate, year));
    }
    
    public static double computeFee(double fee, double rate, int year){
        for(int i=1; i<year; i++){
            fee *= (rate+1);
        }
        return fee;
    }
}
