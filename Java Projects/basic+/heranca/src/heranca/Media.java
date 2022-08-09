/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author gabriel1908
 */
public class Media {
    private String name, gen, yearProduction;
    private boolean isVideo;
    private int copies;
    private float locationPrice;
    
    public Media(String name, String gen, String yearProd, boolean isVideo, int nCopies, float locationPrice){
        this.name = name;
        this.gen = gen;
        this.yearProduction = yearProd;
        this.isVideo = isVideo;
        this.copies = nCopies;
        this.locationPrice = locationPrice;
    }

    public String getName() {
        return name;
    }

    public String getGen() {
        return gen;
    }

    public String getYearProduction() {
        return yearProduction;
    }

    public boolean isIsVideo() {
        return isVideo;
    }

    public int getCopies() {
        return copies;
    }

    public float getLocationPrice() {
        return locationPrice;
    }    
}
