/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTxtFile {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("myAmbition.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("Living in the modern world, a person really");
            printWriter.println("needs to know what he wants to do. In order to lead");
            printWriter.println("a meaningful and colorful life, everyone needs");
            printWriter.println("an ambition. If one does not have an ambition,");
            printWriter.println("he will be like a ship sailing on the");
            printWriter.println("wide sea blindly. That is why I have made up my");
            printWriter.println("mind to become a reporter since my childhood.");
            
            printWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}