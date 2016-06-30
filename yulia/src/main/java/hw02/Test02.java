package hw02;

/**
 * Created by admin on 28.06.2016.
 */
public class Test02 {
    public static void main (String[] args){

        Woman woman1 = new Woman("Anna", "Galina");

        woman1.makeFood();
        woman1.somePeopleMethod();
        woman1.makeSomeWomanThings();
        woman1.getName();

        People woman2 = new Woman("Olga", "Yulia");

        woman2.somePeopleMethod();
        woman2.getName();


    }

}
