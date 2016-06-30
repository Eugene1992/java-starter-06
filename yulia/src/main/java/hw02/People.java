package hw02;

/**
 * Created by admin on 28.06.2016.
 */
public class People {

    public People(){
    }
    private String name;

    public People (String name) {this.name = name;}

    public String getName() {return name;}

    public void setName (String name) {this.name = name;}

    public void makeFood() {System.out.println("People like to eat");}

    public void somePeopleMethod() {System.out.println("All people like to eat well!");}




}
