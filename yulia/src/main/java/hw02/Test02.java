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

        Men men = new Men("Eugene", "MU");
        men.getMenSpecialFiled();
        men.print();

        Children children1 = new Children("Tom", "cute");
        children1.makeFood();
        children1.somePeopleMethod();




    }

}
