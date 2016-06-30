package oop_04;

public class Animal {
    private String name;

    private static Animal ourInstance = new Animal("Cat");

    private Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Animal getInstance() {
        return ourInstance;
    }
}
