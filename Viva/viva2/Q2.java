/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;
import java.util.Scanner;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for Array 1 : ");
        int size1 = sc.nextInt();
        double [] arr1 = new double [size1];
        
        System.out.println("Enter "+size1+" elements : ");
        for(int i=0; i<arr1.length; i++){
            arr1[i]=sc.nextDouble();
        }
        System.out.println("");
        
        System.out.print("Enter the size for Array 2 : ");
        int size2 = sc.nextInt();
        double [] arr2 = new double [size2];
        
        System.out.println("Enter "+size2+" elements : ");
        for(int i=0; i<arr2.length; i++){
            arr2[i]=sc.nextDouble();
        }
        System.out.println("");
        
        System.out.print("Array 1 : {");
        for(int i=0;i<arr1.length; i++){
            System.out.print(arr1[i]);
            if(i!=arr1.length-1)
                System.out.print(", ");
        }
        System.out.print("}");
        System.out.println("");
        
        System.out.print("Array 2 : {");
        for(int i=0;i<arr2.length; i++){
            System.out.print(arr2[i]);
            if(i!=arr2.length-1)
                System.out.print(", ");
        }
        System.out.print("}");
        System.out.println("");
        
        double [] joinedArr = joinArrays(arr1, arr2);
        double [] ascendingArr = ascending(joinedArr);
        double median = calculateMedian(ascendingArr);
        System.out.printf("Median of Arrays : %.3f",median);
        System.out.println("");
    }
    
    public static double[] joinArrays(double[]arr1, double[]arr2){
        int size1 = arr1.length;
        int size2 = arr2.length;
        double [] joinedArr = new double [size1 + size2];
        
        for(int i=0; i<size1; i++){  //add array1 elements
        joinedArr[i]= arr1[i];
        }
        
        for(int j=0; j<size2; j++){  // add array2 elements
        joinedArr[size1+j]= arr2[j];
        }
        return joinedArr;
    }
    
    public static double[] ascending(double [] ascendingArr){
        for(int pass=1; pass< ascendingArr.length; pass++){
            for(int i=0; i < ascendingArr.length-1; i++){
                if(ascendingArr[i]> ascendingArr[i+1]){
                    double temp = ascendingArr[i];
                    ascendingArr[i]= ascendingArr[i+1];
                    ascendingArr[i+1]=temp;
                }
            }
        }
        return ascendingArr;
    }
    
//    public static double[] ascending(double [] ascendingArr){
//        Arrays.sort(ascendingArr);
//        return ascendingArr;
//    }
    
    public static double calculateMedian(double [] median){
         int middle = median.length/2;
         if(median.length%2==0){  //when the size of array is even,sum up the middle two value and divide by 1
             return (median[middle-1]+median[middle])/2;
         }else{         //when the size of array is odd, middle element is the median
             return median[middle];
         }
    }
}
