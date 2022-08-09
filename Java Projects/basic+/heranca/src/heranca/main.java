/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

import java.util.Scanner;

/**
 *
 * @author gabriel1908
 * 
 *  Super == chama contrutor da superclass
 * 
 */
public class main {
    static void cleanBuffer(Scanner sc){
        sc.nextLine();
    }
    
    public static void main(String[] argv){
        Dvds[] arrDvds = new Dvds[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 1; i++){
            String name = sc.nextLine();
            String gen = sc.nextLine();
            String yearProd = sc.nextLine();
            boolean isVideo = sc.nextBoolean();
            int locCopies = sc.nextInt();
            float locPrice = sc.nextFloat();
            String[] actorsList = {"actor1 printed", "actor2 printed"};
            cleanBuffer(sc);
            String director = sc.nextLine();
            float runTime = sc.nextFloat();
            int ageRating = sc.nextInt();
            
            arrDvds[i] = new Dvds(name, gen, yearProd, isVideo, locCopies, locPrice, actorsList, director, runTime, ageRating);
            
            String[] data = arrDvds[i].getActorsList();
            for(int j = 0; i < data.length; i++){
                System.out.println("NAME: "+data[i]);
            }
//            System.out.println("NAME: "+arrDvds[i].getActorsList());
        }
    }
}
