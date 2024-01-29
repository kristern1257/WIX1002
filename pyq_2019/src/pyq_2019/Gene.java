/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2019;

import java.util.Scanner;


public class Gene {
    public static void main(String[] args) {
    //from yining dashen
    Scanner k = new Scanner(System.in);
            String genome;
            int count = 0; //to check gene string is multiple of 3

            do {
                boolean geneFound = false; //check gene found
                System.out.print("Enter genome string [quit to stop] : ");
                genome = k.nextLine();

                //break immmediately if quit entered
                if(genome.equalsIgnoreCase("quit")){
                    break;
                }

                for (int i = 0; i < genome.length() - 2; i++) {
                    //check start codon
                    if (genome.charAt(i) == 'A' && genome.charAt(i + 1) == 'T' && genome.charAt(i + 2) == 'G') {

                        //check end codon
                        for (int j = i + 3; j < genome.length() - 2; j++) {
                            if ((genome.charAt(j) == 'T' && genome.charAt(j + 1) == 'A' && genome.charAt(j + 2) == 'G')||
                                     (genome.charAt(j) == 'T' && genome.charAt(j + 1) == 'A' && genome.charAt(j + 2) == 'A')||
                                     (genome.charAt(j) == 'T' && genome.charAt(j + 1) == 'G' && genome.charAt(j + 2) == 'A')) {

                                //if found, find gene
                                for (int p = i + 3; p < j; p++) {
                                    //not ATG,TAG,TAA,TGA inside gene code
                                    if ((genome.charAt(p) == 'A' && genome.charAt(p + 1) == 'T' && genome.charAt(p + 2) == 'G')||
                                             (genome.charAt(p) == 'T' && genome.charAt(p + 1) == 'A' && genome.charAt(p + 2) == 'G')||
                                             (genome.charAt(p) == 'T' && genome.charAt(p + 1) == 'A' && genome.charAt(p + 2) == 'A')
                                            || (genome.charAt(p) == 'T' && genome.charAt(p + 1) == 'G' && genome.charAt(p + 2) == 'A')) {
                                        geneFound = false;
                                        break; //结束当前基因查找的循环，直接跳到下一个 ATG 的位置继续查找
                                    }else{
                                       count++; 
                                       geneFound = true;
                                    }
                                }
                                //print gene
                                if (count % 3 == 0 && geneFound){
                                    for (int p = i + 3; p < j; p++) {

                                        System.out.print(genome.charAt(p));
                                    }
                                    System.out.println();
                                }else{
                                    geneFound = false;
                                }

                            }
                        }

                    }
                }
                if (!geneFound) {
                    System.out.println("No gene is found.");
                }

            } while (!genome.equalsIgnoreCase("quit"));
        }
    }
