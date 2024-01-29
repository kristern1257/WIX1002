/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Q4 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("myAmbition.txt"));
            int sentence=0,word=0;
            int[] frequency=new int[26];
            String[] words;
            
            System.out.println("The essay is : ");
            
            while(sc.hasNextLine()){
                String temp = sc.nextLine();
                //count number of sentences by finding '.'
                if(temp.contains(".")){
                    sentence++;
                }
                
                //count number of alphabet
                for(int i=0;i<temp.length();i++){
                    //检查当前字符是否为字母
                    if(Character.toLowerCase(temp.charAt(i))-'a'>=0 && Character.toLowerCase(temp.charAt(i))-'a'<=25){
                        //确保字符是从 'a' 到 'z' 的字母
                        frequency[(Character.toLowerCase(temp.charAt(i))-'a')]++;
                        //将字符减去 'a' 来得到相对于frequency中的索引位置，然后递增该位置的频率计数 (0=a , 1=b, 2=c ...)
                    }
                }
                
                //count number of words
                words = temp.split(" ");  //split by blackspace
                 for(int i=0;i<words.length;i++){
                     System.out.print(words[i]+" ");  // print out the essay
                     if(!words[i].equalsIgnoreCase("")) //检查当前单词是否为空
                        word++;
                 }
                System.out.println(); 
            }
                System.out.println("Number of sentences : "+sentence);
                System.out.println("Number of words : "+word);
                
                for(int i=0;i<frequency.length;i++){
                    System.out.print((char)(i+'a')+" : "+frequency[i]+"  ");
                }
                sc.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
