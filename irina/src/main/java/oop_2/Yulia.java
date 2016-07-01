package oop_2;


public class Yulia extends Customers {

    public String position;
    public int age;

    public Yulia(){

    }
    public Yulia(String name, String position, int age){
        super(name);
        this.position = position;
        this.age = age;

    }
}
