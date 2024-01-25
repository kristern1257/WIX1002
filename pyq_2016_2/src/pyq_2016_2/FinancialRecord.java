/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2016_2;


public class FinancialRecord {
    private int id;
    private double balance;
    private double annualInterestRate;

    public FinancialRecord() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }
        
    public FinancialRecord(int id,double initialbalance){
        this.id=id;
        this.balance=initialbalance;
        this.annualInterestRate=0.0;
    }
    
    //Setters
    public void setId(int id){
        this.id =id;
    }
    
    public void setBalance(double balance){
        this.balance =balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    
    //Getters
    public int getId(){
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }
    
    public void withdraw(double withdraw){
        System.out.println("\nPrevious balance : RM " + balance);
        balance -= withdraw;
        System.out.printf("Current balance after withdrawal of RM "+withdraw+" is: RM %.1f ", balance);
    }
    
    public void deposit(double dep){
        System.out.println("\nPrevious balance : RM " + balance);
        balance += dep;
        System.out.printf("Current balance after deposit of RM "+dep+" is: RM  %.1f", balance);
    }
    
    public void displayRecordInfo(){
        System.out.println("Financial record id is : "+ this.id);
        System.out.println("Financial record balance is : "+ this.balance);
        System.out.println("Annual interest rate is : " + this.annualInterestRate);
        System.out.print("The monthly interest rate is :" + getMonthlyInterestRate());
    }
}
