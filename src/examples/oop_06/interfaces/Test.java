package oop_06.interfaces;

/**
 * Created by Student on 7/1/2016.
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car(60);
        Dog dog = new Dog(15);
        Chair chair = new Chair();


        System.out.println(countDistance(2, dog));
        System.out.println(countDistance(2, car));
        //System.out.println(countDistance(2, chair)); //Chair dont implement Runnable

    }

    static int countDistance(int hours, Runnable runnable){
        return runnable.getDistance(hours);
    }

}
