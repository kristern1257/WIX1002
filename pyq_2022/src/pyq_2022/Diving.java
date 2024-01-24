/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2022;
import java.util.*;

public class Diving {
    //fields
    protected String name,country;
    protected double[] []  scores;
    protected double [] rating;
    
    //empty constructor
    public Diving(){
        this.name= null;
        this.country= null;
        this.scores= new double[3][7];
        this.rating= new double[3];
    }
    
    //constructor
    public Diving(String name, String country, double[][] scores, double[] rating) {
        this.name = name;
        this.country = country;
        this.scores = scores;
        this.rating = rating;
    }
    
    //accessor method for name and country (setter getter)
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    
    //method that returns the final score
    public double finalScore(){
        double remain=0,total=0;
        //sort the marks
        for(int i=0;i<this.scores.length;i++){      //scores.length = 3行 (rows)
            Arrays.sort(this.scores[i]);            //进行排序，scores[i].length =  第一行的i列 (column)
            for(int j=2;j<this.scores[i].length-2;j++){  //跳掉前面两个最低分数，循环到后两个最高分停
                remain+=this.scores[i][j];              //将去掉最低和最高分后的分数相加，计算剩余分数
            }      
            total+=remain*this.rating[i];
            remain=0;       //重置剩余分数，为下一个评委做准备。
        }
        return total;
    }
    
    //return participant profile, judges scores, difficulty rating and final score.
    @Override
    public String toString(){
        String result="";
        result += "Diver : " + getName() + " (" + getCountry() + ") ";
        for(int i=0;i<scores.length;i++){   //裂出每一位评委的打分
            result += "\nJudges Scores : " + Arrays.toString(scores[i]);
            result += "\nDifficulty Rating : " + String.format("%.1f",rating[i]);
        }
        result+="\nFinal Score : "+String.format("%.1f", finalScore());
        result+="\n";
        return result;
    }
    
    
}
