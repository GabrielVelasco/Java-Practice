/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pearsoncalc;

/**
 *
 * @author gabriel1908
 */
public class PearsonCalc {

    /**
     * @param args the command line arguments
     */
    public static int sum2numbers(int a, int b){
        return a+b;
    }
    
    public static float calcAvg(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        return (float)sum / arr.length;
    }
    
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6};
        int[] y = {3,440,1200,1500,2100,2600};
        
        Pearson p = new Pearson(x, y, calcAvg(x), calcAvg(y));
        
        System.out.println(p.doCalc());
//        System.out.println("Result p == "+p.doCalc());
    }
    
}
