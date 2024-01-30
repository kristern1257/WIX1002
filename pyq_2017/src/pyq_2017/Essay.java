/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2017;

public class Essay extends GradedActivity {
    protected int grammar, spelling, length, content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        
        setScore(grammar+spelling+length+content);
    }
    
    @Override
    public String toString() {
        return "Essay score: " + "\nGrammer: " + grammar + "\nSpelling: " + spelling + "\nLength: " + length + "\nContent: " + content;
    }
    
    
}
