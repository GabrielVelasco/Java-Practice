/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pearsoncalc;

import java.lang.Math;

/**
 *
 * @author gabriel1908
 */
public class Pearson {
    int[] x, y;
    int n;
    float xAvg, yAvg;
//    private int[] y;
    
    public Pearson(int[] x, int[] y, float xAvg, float yAvg){
        this.x = x;
        this.y = y;
        this.xAvg = xAvg;
        this.yAvg = yAvg;
        if(this.x.length == this.y.length){
            this.n = x.length;
        }else{
            this.n = 0;
        }
    }
    
    public float doCalc(){
        float num = 0, finalDen = 0,den1 = 0, den2 = 0;
        
        for(int i = 0; i < this.n; i++){
            num = num + ((x[i] - this.xAvg)*(y[i] - this.yAvg));
   
            den1 = den1 + ((x[i] - this.xAvg)*(x[i] - this.xAvg));
            den2 = den2 + ((y[i] - this.yAvg)*(y[i] - this.yAvg));
        }
        
        den1 = (float) Math.sqrt(den1);
        den2 = (float) Math.sqrt(den2);
        finalDen = den1*den2;
        
        return (num/finalDen);
    }
    
    public void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
           System.out.println(" "+arr[i]);
        }
    }
}
