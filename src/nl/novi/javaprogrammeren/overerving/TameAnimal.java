package nl.novi.javaprogrammeren.overerving;

public class TameAnimal {

    private String name;
    private String nameOfTheOwner;
    private String favoriteFoodBrand;
    private String sex;
    private String breed;

    public String getName () {
        return name;
    }

    public void setName (String newName) {
        this.name = newName;
    }

    public String getNameOfTheOwner () {
        return nameOfTheOwner;
    }

    public void setNameOfTheOwner (String newName) {
        this.nameOfTheOwner = newName;
    }

    public String getFavoriteFoodBrand () {
        return favoriteFoodBrand;
    }

    public void setFavoriteFoodBrand (String newFavoriteFoodBrand) {
        this.favoriteFoodBrand = newFavoriteFoodBrand;
    }

    public String getSex () {
        return sex;
    }

    public void setSex (String newSex) {
        this.sex = newSex;
    }

    public String getBreed () {
        return breed;
    }

    public void setBreed (String newBreed) {
        this.name = newBreed;
    }

    public static void move () {
        System.out.println("Animal moves 0.25m.");
    }

}
