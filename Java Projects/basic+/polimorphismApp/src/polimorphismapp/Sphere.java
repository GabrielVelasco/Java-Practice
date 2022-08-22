/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphismapp;

/**
 *
 * @author gabriel1908
 */
public class Sphere extends Forma3D{
    private final float raio;

    public Sphere(String colour, String id, int x, int y, int z, float raio){
        super(colour, id, x, y, z);
        this.raio = raio;
    }
    
    public float getRaio() {
        return raio;
    }
}
