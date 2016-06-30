package oop_1;

public class Scopes {

    private String name;

    public Scopes() {
    }

    public Scopes(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(String name) {
        System.out.println("Shop " + getName(name));
    }

    public void someMetod(String metod) {
        System.out.println(metod);
    }

    public void someMetod2(String metod2) {
        System.out.println(metod2);
    }


}
