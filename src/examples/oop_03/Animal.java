package oop_03;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeVoice(){
        System.out.println("Animal said something");
    }

    public void someAnimalMethod(){
        System.out.println("Animal method");
    }

}
