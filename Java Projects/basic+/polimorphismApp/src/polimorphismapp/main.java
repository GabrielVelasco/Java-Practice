/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorphismapp;

/**
 *
 * @author gabriel1908
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Square sqr1 = new Square("black", "1", 0, 0, 2);
//        CIrcle cir1 = new CIrcle("white", "2", 0, 0, 1);
//        Triangle tri1 = new Triangle("pink", "3", 0, 0, 2, 4);

        Forma[] arr = new Forma[5];
        arr[0] = new Square("black", "1", 0, 0, 2);
        
        System.out.println(((Forma2D)arr[0]).calcArea());
        
        if (arr[0] instanceof Forma2D){
            System.out.println("YESSSS");
        }else{
            System.out.println("NOOOO");
        }
    }
    
}
