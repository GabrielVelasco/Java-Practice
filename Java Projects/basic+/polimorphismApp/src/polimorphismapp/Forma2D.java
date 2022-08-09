/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphismapp;

/**
 *
 * @author gabriel1908
 */
public class Forma2D extends Forma{
    private final int x, y;

    public Forma2D(String colour, String id, int x, int y){
        super(colour, id);
        this.x = x;
        this.y = y;
    }
    
    public float calcArea(){
        if (this instanceof CIrcle){
            float area = (float)3.14 * ((CIrcle)this).getRaio();
            return area;
            
        }else if (this instanceof Square){
            float area = ((Square)this).getLado() * ((Square)this).getLado();
            return area;
            
        }else {
            float area = ((Triangle)this).getBase()* ((Triangle)this).getAlt();
            return area;
        }
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
