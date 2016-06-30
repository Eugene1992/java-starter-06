package oop_2;


public class Eugeniy extends Customers {

    public String position;
    public int age;

    public Eugeniy(){

    }
    public Eugeniy(String name, String position, int age){
        super(name);
        this.position = position;
        this.age = age;
    }
}
