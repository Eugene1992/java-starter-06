package oop_04;

/**
 * Created by Student on 6/29/2016.
 */
public class Test {
    public static void main(String[] args) {

        Animal animal1 = Animal.getInstance();
        Animal animal2 = Animal.getInstance();

        System.out.println(animal1.getName());
        System.out.println(animal2.getName());

        //Car car = new Car();
        //car.run();

        HomeDog homeDog = new HomeDog();

        //Math math = new Math();
        Math.cos2();
    }
}
