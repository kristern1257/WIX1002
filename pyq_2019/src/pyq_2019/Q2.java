/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019;
import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int [][] matrixA = new int [n][n];
        int [][] matrixB = new int [n][n];
        generate(matrixA);
        generate(matrixB);
        System.out.println("Matrix A");
        display(matrixA);
        System.out.println("Matrix B");
        display(matrixB);
        System.out.println("Matrix A + B ");
        display(add(matrixA, matrixB));
        System.out.println("Matrix A x B");
        display(multiply(matrixA, matrixB));
    }
    
    public static void generate(int [][]matrix){
        Random r= new Random();
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                int num = r.nextInt(10);
                matrix [i][j]= num; 
            }
        }
    }
    
    public static void display(int[][]matrix){
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

    }
    
    public static int[][] add(int[][] matrixA,int [][] matrixB){
        int [][] result = new int[matrixA.length][matrixA[0].length];
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                result[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        return result;
    }
    
    public static int[][] multiply(int[][] matrixA,int [][] matrixB){
        int [][] result = new int[matrixA.length][matrixB[0].length];
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[i].length; j++){
                for(int k=0;k<matrixA.length;k++){
                    result[i][j]+=matrixA[i][k]*matrixB[k][j];
                }
            }
        }
        return result;
    }
}
