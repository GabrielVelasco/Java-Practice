/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphismapp;

/**
 *
 * @author gabriel1908
 */
public class Triangle extends Forma2D{
    private float base, alt;
    
    public Triangle(String colour, String id, int x, int y, float base, float alt){
        super(colour, id, x, y);
        this.base = base;
        this.alt = alt;
    }

    public float getBase() {
        return base;
    }

    public float getAlt() {
        return alt;
    }
}
