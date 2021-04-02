package nl.novi.javaprogrammeren.overerving;

public class WildAnimal extends Animal {
    private String nameOfCage;
    private String lastDinner;
    private String countryOfBirth;
    private int howManyKids;
    private int howManyStripes;

    public WildAnimal (String name, String sex, String breed, String countryOfBirth, String howManyKids, String lastDinner, String nameOfCage) {}

    @Override
    public void moving() {
        System.out.println("Ik beweeg nu 0.5m");
    }

    public int getHowManyKids (int newHowManyKids) {return howManyKids;}

    public void setHowManyKids (int newHowManyKids) { this.howManyKids = newHowManyKids;}

    public int getHowManyStripes (int newHowManyStripes) {return howManyStripes;}

    public void setHowManyStripes (int newHowManyStripes) { this.howManyStripes = newHowManyStripes;}

    public String getNameOfCage(String newNameOfCage) {
        return nameOfCage;
    }

    public void setNameOfCage (String newNameOfCage) {
        this.nameOfCage = newNameOfCage;
    }

    public String getLastDinner () {
        return lastDinner;
    }

    public void setLastDinner (String newLastDinner) {
        this.lastDinner = newLastDinner;
    }

    public String getCountryOfBirth () {
        return countryOfBirth;
    }

    public void setCountryOfBirth (String newCountryOfBirth) {
        this.countryOfBirth = newCountryOfBirth;
    }
}
