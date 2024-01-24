/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pyq_2022;
//import java.io.*;
//import java.util.*;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
        

public class Q2 {

    public static void main(String[] args) {
        try{
            Scanner inputStream = new Scanner (new FileInputStream("diving.txt"));
            int temps = 0, counter = 0;
            while (inputStream.hasNextLine()){ //每次遇到新的一行数据时，counter 递增
                if (counter %5==0){  //每条记录包含name、country、三组评委分数，共 5 行为一个记录，temp代表文件中记录的总记录数
                    temps++;
                }
                counter++;  //每次遇到新的一行数据时，counter +1, 表示当前已经处理过的行数
                inputStream.nextLine(); //读取，移动到下一行
            }
            
            inputStream.close();
            
            //重新读取文件
            Scanner sc = new Scanner (new FileInputStream("diving.txt"));
            int realCount =0;       //用于追踪当前处理到文件的第几个记录（每个选手的信息被视为一个记录）
            Diving[] count = new Diving[temps];     //数组 count，用于存储 Diving 对象

            // 处理每条记录
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String country = sc.nextLine();
                
                double [] rating = new double[3];
                double[][] scores = new double[3][7];
                
                // 处理每位评委的分数和评分
                for (int i = 0; i < 3; i++) {
                    String scoreLine = sc.nextLine();
                    String[] temp = scoreLine.split(" ");
                    for (int j = 0; j < 8; j++) { //遍历8个column
                        if (j == 7) {   //last value for each attempt is the difficulty rating
                            rating[i] = Double.parseDouble(temp[j]);
                        } else {
                            scores[i][j] = Double.parseDouble(temp[j]); //将该分数转换为 double并存储到scores的第 i 行、第 j 列（即第 i 位评委的第 j 次打分）。
                        }
                    }
                }
                
                // 创建 Diving 对象并存储
                count[realCount]=new Diving(name, country, scores, rating);
                System.out.println(count[realCount].toString()); //call toString method to display info of divers
                realCount++;
            }
            sc.close();
            
            System.out.println("");
            displayWinner(count);
            System.out.println("Gold   : " +count[0].getName()+" ("+count[0].getCountry()+")");
            System.out.println("Silver : " +count[1].getName()+" ("+count[1].getCountry()+")");
            System.out.println("Bronze : " +count[2].getName()+" ("+count[2].getCountry()+")");
            System.out.println("");
            System.out.println("Total number of records : "+temps);
            
        } catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }
    
    public static void displayWinner(Diving[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j].finalScore()< a[j+1].finalScore()){
                    Diving temp= a[j];      //bubble sort
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        } 
    }
    
}