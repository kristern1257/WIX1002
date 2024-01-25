/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2016_2;
import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        final int dimension = 3;
        int [][] board = new int [dimension][dimension];  //3x3 board
        
        //generate random ticktcktoe and fills the board with 0 or 1
        for (int i=0; i<board.length; i++){
            for (int j=0; j< board[i].length; j++){
            Random r = new Random();
            board[i][j]= r.nextInt(2);
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        findRow(board);
        findColumn(board);
        findDiagonal(board);
    }
    
    //find rows with all 0 or 1
    public static void findRow(int [][] a){
        for(int i=0;i<a.length;i++){
            int counter=0;
            int temp;
            for(int j=0;j<a[i].length-1;j++){ 
                if(a[i][j]==a[i][j+1]){         //compare
                    counter++;
                }
            }
            if(counter==2){
                temp = a[i][0]; 
                System.out.println("All "+temp+"s on row "+(i));
            }  
        }
    }
    
    //find column with all 0 or 1
    public static void findColumn(int [][] a){
        for(int i=0;i<a.length;i++){
            int counter=0;
            int temp;
            for(int j=0;j<a[i].length-1;j++){
                if(a[j][i]==a[j+1][i]){
                    counter++;
                }
            }
            if(counter==2){
                temp=a[0][i];
                System.out.println("All "+temp+"s on column "+(i));
            }  
        }
    }
    
    //find diagonal with all 0 or 1
    public static void findDiagonal(int [][] a){
        int counter=0,counter2=0;
        int temp,temp2;
        
        // Check diagonal 1 from top-left to bottom-right
        for(int i=0;i<a.length-1;i++){
            if(a[i][i]==a[i+1][i+1]){  //check 00，11，22
               counter++;
            }
        }
        if(counter==2){
            temp=a[0][0];
            System.out.println("All "+temp+"s on diagonal 1");
        }
        
        //Check diagonal 2 from top-right to bottom-left
        for(int i=0;i<a.length-1;i++){
            if(a[i][a.length-1-i]==a[i+1][a.length-1-i-1]){  // check 02,11,20
                    counter2++;
            }
        }
        if(counter2==2){
            temp2=a[0][2];
            System.out.println("All "+temp2+"s on diagonal 2");
        }
    }

}
