/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2018;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTxtFile{
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("Q4.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.println("Ahmad,5,6,6.5,5.5,7,2");
            printWriter.println("David,8,6,6.5,7.5,7.5,1");
            printWriter.println("Mutu,4,6,5.5,4.5,4,2");
            printWriter.println("Fairuz,6.5,7,7.5,8,8,1");
            
            printWriter.close();
            fileWriter.close();
            
        } catch(IOException e){
            System.out.println("Error occurs when writing file:: " + e.getMessage());
        }
    }
}
