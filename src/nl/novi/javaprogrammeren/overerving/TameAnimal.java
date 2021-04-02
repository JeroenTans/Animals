package nl.novi.javaprogrammeren.overerving;

public class TameAnimal extends Animal {
    private String nameOfTheOwner;
    private String favoriteFoodBrand;

    public String getNameOfTheOwner () {
        return nameOfTheOwner;
    }

    public void setNameOfTheOwner (String newName) {
        this.nameOfTheOwner = newName;
    }

    public String getFavoriteFoodBrand () {
        return favoriteFoodBrand;
    }

    public void setFavoriteFoodBrand (String newFavoriteFoodBrand) { this.favoriteFoodBrand = newFavoriteFoodBrand; }
}
