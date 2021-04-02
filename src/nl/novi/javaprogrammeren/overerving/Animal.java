package nl.novi.javaprogrammeren.overerving;

public class Animal {
    private String name;
    private String sex;
    private String breed;

    public void moving () {
        System.out.println("Ik beweeg nu 0.25m");
    }

    public void sleeping () {
        System.out.println("zzzZZZzzzZzz ik slaap zo n acht uur per dag! zzZZz");
    }

    public String getName () {
        return name;
    }

    public void setName (String newName) {
        this.name = newName;
    }


    public String getSex () {
        return sex;
    }

    public void setSex (String newSex) {
        this.name = newSex;
    }

    public String getBreed () {
        return breed;
    }

    public void setBreed (String newBreed) { this.name = newBreed; };




}
