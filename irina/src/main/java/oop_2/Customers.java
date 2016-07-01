package oop_2;


public class Customers {

    private String name;


    public Customers(){

    }
    public Customers(String name){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printName(String name){
        System.out.println("Мой любимый муж " + getName());

    }

}
