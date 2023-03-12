/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphismapp;

/**
 *
 * @author gabriel1908
 */
public class Cube extends Forma3D{
    private final float lado;

    public Cube(String colour, String id, int x, int y, int z, float lado){
        super(colour, id, x, y, z);
        this.lado = lado;
    }
    
    public float getLado() {
        return lado;
    }
}
