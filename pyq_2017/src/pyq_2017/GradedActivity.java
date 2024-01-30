/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2017;

public class GradedActivity {
    protected int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public char getGrade(int score){
        char grade;
        if(score>=90)
            return grade = 'A';
        else if(score>=80)
            return grade = 'B';
        else if(score>=70)
            return grade = 'C';
        else if(score>=60)
            return grade = 'D';
        else
            return grade = 'F';
    }

    @Override
    public String toString() {
        return "Total score : " +getScore()+ "\nEssay grade: " + getGrade(score);
    }
    
    
}
