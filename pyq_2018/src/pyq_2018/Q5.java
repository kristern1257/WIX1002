/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2018;

public class Q5 {
    public static void main(String[] args) {
        Apple red=new Apple("Apple","Red",8);
        Apple green=new Apple("Apple","Green",11);
        
        Watermelon local=new Watermelon("Watermelon","Local",7.6);
        Watermelon imported=new Watermelon("Watermelon","Imported",4.0);
        
        //print fruit
        System.out.println(red.toString());
        System.out.println(green.toString());
        System.out.println(local.toString());
        System.out.println(imported.toString());
        //print cheapest item
        System.out.println("The cheapest item is");
        getCheapestFruit();
    }
    
    public static void getCheapestFruit(){
        Apple red=new Apple("Apple","Red",8);
        Apple green=new Apple("Apple","Green",11);
        
        Watermelon local=new Watermelon("Watermelon","Local",7.6);
        Watermelon imported=new Watermelon("Watermelon","Imported",4.0);
        
        double[]arr={red.totalPrice(),green.totalPrice(),local.totalPrice(),imported.totalPrice()};
        for(int pass=1;pass<arr.length;pass++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    double hold=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=hold;
                }
            }
        }
        double minPrice=arr[0];
        
        // Print details of the corresponding Fruit object with the minimum price
        for (Fruit fruit : new Fruit[]{red, green, local, imported}) {
            if (fruit.totalPrice() == minPrice) {
                System.out.println(fruit.toString());
                break; // Stop once we find the corresponding fruit
            }
        }
    }
}
