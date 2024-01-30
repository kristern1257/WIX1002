/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2017;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = sc.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = sc.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = sc.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = sc.nextInt();
        System.out.println("");
        
        Essay essay = new Essay(grammar, spelling, length, content);
        GradedActivity grade = new GradedActivity();
        //Set the score for the grade object using the Essay's score 
        grade.setScore(essay.getScore());
        System.out.println(essay.toString());
        System.out.println("\n"+grade.toString());
        
        
        
    }
}
