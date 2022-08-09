/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphismapp;

/**
 *
 * @author gabriel1908
 */
public class CIrcle extends Forma2D{
    private final float raio;
    
    public CIrcle(String colour, String id, int x, int y, float raio){
        super(colour, id, x, y);
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }
}
