/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyq_2017;

public class Complex {
    protected double real, imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void addComplexNum(double[]r, double[]i){
        for(int j=0;j<2;j++){
            real += r[j];
            imaginary += i[j];
        }
        // Convert the result to int by rounding and removing the decimal part
        real = (int)Math.round(real);
        imaginary = (int)Math.round(imaginary);
    }
    
    public void subtractComplexNum(double[]r,double[]i){
        for(int j=0;j<2;j++){
            real+=r[j];
            imaginary+=i[j];
        }
    }
    
    @Override
    public String toString(){
        return "("+real+"+"+imaginary+"i)";
    }
    
}
