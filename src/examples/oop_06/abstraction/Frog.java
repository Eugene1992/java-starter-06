package oop_06.abstraction;

/**
 * Created by Student on 7/1/2016.
 */
public class Frog extends Amphibian{

    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " run...");
    }
}
