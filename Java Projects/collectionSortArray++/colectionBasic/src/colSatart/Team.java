package colSatart;

// given an array of Teams, sort by name

public class Team implements Comparable<Team>{
    private final String fullName;

    public Team(String name){
        this.fullName = name;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public int compareTo(Team otherTeam){
//        return (this.fullName).compareTo(otherTeam.fullName); // ascending order, call sort()
        return (otherTeam.fullName).compareTo(this.fullName); // compareTo only with Strings
    }
}
