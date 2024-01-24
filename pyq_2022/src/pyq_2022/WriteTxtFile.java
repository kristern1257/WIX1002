/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2022;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTxtFile {

    public static void main(String[] args) {
        try {
            // 创建一个名为 diving.txt 的文本文件，如果文件已存在，则覆盖它
            FileWriter fileWriter = new FileWriter("diving.txt");

            // 使用 PrintWriter 来写入数据到文件
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // 写入具体的数据
            printWriter.println("James Wong");
            printWriter.println("New Zealand");
            printWriter.println("5.5 6.0 5.5 5.0 5.5 6.5 5.0 2.8");
            printWriter.println("6.5 7.0 5.5 7.0 5.5 6.5 6.0 2.4");
            printWriter.println("4.5 4.0 4.5 4.0 4.5 4.5 4.0 3.1");
            printWriter.println("Xiao Wong");
            printWriter.println("China");
            printWriter.println("7.5 8.0 8.5 8.0 7.5 8.5 8.0 2.6");
            printWriter.println("6.5 7.0 5.5 7.0 5.5 6.5 6.0 3.0");
            printWriter.println("8.5 8.0 8.0 8.0 9.0 9.0 8.5 2.8");
            printWriter.println("Ken Momata");
            printWriter.println("Japan");
            printWriter.println("6.5 6.5 6.5 6.0 7.0 6.5 6.0 2.6");
            printWriter.println("5.5 4.0 5.5 4.0 5.5 4.5 5.0 2.8");
            printWriter.println("6.0 5.5 5.5 6.0 6.5 6.0 6.0 2.5 ");
            printWriter.println("Anton Andrew");
            printWriter.println("United States");
            printWriter.println("7.5 7.0 6.5 8.0 8.0 7.5 7.0 2.4");
            printWriter.println("5.5 6.0 6.5 5.0 5.5 5.5 6.0 3.0");
            printWriter.println("7.0 7.0 7.5 7.5 7.0 6.5 7.5 2.8");
            printWriter.println("Oliver Martin");
            printWriter.println("Germany");
            printWriter.println("8.0 8.5 8.5 8.0 7.5 8.5 8.0 2.4");
            printWriter.println("7.0 7.5 7.0 7.5 7.5 7.5 6.5 2.8");
            printWriter.println("4.5 5.0 5.0 5.5 5.5 5.5 4.5 3.1");
            //the last value for each attempt is the difficulty rating
            
            // 关闭 PrintWriter 和 FileWriter
            printWriter.close();
            fileWriter.close();

            System.out.println("数据成功写入到 diving.txt 文件。");

        } catch (IOException e) {
            System.out.println("写入文件时出现错误：" + e.getMessage());
        }
    }
}
