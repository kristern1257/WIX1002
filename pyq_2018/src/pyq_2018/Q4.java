/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2018;
import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner (new FileInputStream("Q4.txt"));
        //count number of players
        int counter=0;
            while(sc.hasNextLine()){
                sc.nextLine();
                counter++;
            }
            
        //Declare array
        String[] name =new String[counter];
        double[][] mark =new double[counter][5];
        double[] difficulty=new double[counter];
         
        sc = new Scanner (new FileInputStream("Q4.txt"));
        int count=0;
        while(sc.hasNextLine()){
            String[] temp=(sc.nextLine()).split(","); //Name 1 2 3 4 5 difficulty
            for(int i=0;i<temp.length;i++){
                if(i==0){
                    name[count]=temp[i];   /// name[0] --> name[1]
                }
                else if(i==temp.length-1){
                    difficulty[count]=Double.parseDouble(temp[i]);
                }
                else{
                    mark[count][i-1]=Double.parseDouble(temp[i]); //mark[0][0]; mark[0][1] mark[0][2].....mark[0][5]
                } //count=0
            }
            count++; ///count=1
        }
        sc.close();
        
        //sort the marks
            //sum up the marks and multiply to get final score;
            double [] finalScore = new double[counter];
            double sum=0;
            for(int i=0;i<mark.length;i++){
                Arrays.sort(mark[i]);  // sorts the array of marks for the current player in ascending order
                for(int j=1;j<mark[i].length-1;j++){  //skip the lowest and highest mark
                    sum+=mark[i][j];
                }
                finalScore[i]=sum*difficulty[i];
                sum=0;
            }
            
            //Display the final score for each player and determine the winner
            double max=finalScore[0];
            int index=0;
            for(int i=0;i<finalScore.length;i++){
                System.out.println(name[i]+"  score  "+finalScore[i]);
                if(finalScore[i]>max){
                    max=finalScore[i];
                    index=i;
                }
            }
            System.out.println(name[index]+" is the winner ");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
