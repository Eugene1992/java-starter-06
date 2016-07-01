package oop_2;


public class Irina extends Customers {

    public String position;
    public int age;

    public Irina(){

    }
    public Irina(String name, String position, int age){
        super(name);
        this.position = position;
        this.age = age;

    }

    public void printIrina(){
        super.printName();
    }
}
