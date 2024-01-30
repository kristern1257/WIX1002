/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2016_2;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        FinancialRecord frA = new FinancialRecord(1234,10000.0);
        frA.setAnnualInterestRate(7.77);
        System.out.println("The information about financial reocrd A is as follow: ");
        frA.displayRecordInfo();
        System.out.println("");
        
        FinancialRecord frB = new FinancialRecord(1001,20000.0);
        frB.setAnnualInterestRate(8.0);
        frB.setBalance(20000.0);
        frB.setId(1235);
        System.out.println("\nThe information about financial reocrd B is as follow: ");
        frB.displayRecordInfo();
        frB.deposit(1500.0);
        frB.withdraw(500.0);
        
    }
}
