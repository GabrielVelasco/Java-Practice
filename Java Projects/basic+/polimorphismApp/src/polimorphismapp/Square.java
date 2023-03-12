/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphismapp;

/**
 *
 * @author gabriel1908
 */
public class Square extends Forma2D{
    private final float lado;

    public Square(String colour, String id, int x, int y, float lado){
        super(colour, id, x, y);
        this.lado = lado;
    }
    
    public float getLado() {
        return lado;
    }
}
