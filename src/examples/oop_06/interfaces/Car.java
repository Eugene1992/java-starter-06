package oop_06.interfaces;

/**
 * Created by Student on 7/1/2016.
 */
public class Car implements Runnable{
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public int getDistance(int hours) {
        return speed  * hours;
    }
}
