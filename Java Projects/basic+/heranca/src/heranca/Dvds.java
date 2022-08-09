/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author gabriel1908
 */
public class Dvds extends Media {
    private String[] actorsList;
    private String director;
    private float runTime;
    private int ageRating;
    
    public Dvds(String name, String gen, String yearProd, boolean isVideo, int nCopies, float locationPrice, String[] actorsList, String director, float runTime, int ageRating){
        super(name, gen, yearProd, isVideo, nCopies, locationPrice);
        this.actorsList = actorsList;
        this.director = director;
        this.runTime = runTime;
        this.ageRating = ageRating;
    }

    public String[] getActorsList() {
        return actorsList;
    }

    public String getDirector() {
        return director;
    }

    public float getRunTime() {
        return runTime;
    }

    public int getAgeRating() {
        return ageRating;
    }   
}
