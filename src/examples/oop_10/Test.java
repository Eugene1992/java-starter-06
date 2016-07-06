package oop_10;


/**
 * Created by Student on 7/6/2016.
 */
public class Test {
    public static void main(String[] args) {
        Ship.Engine engine = new Ship().new Engine();

        Cat cat = new Cat();

        makeRun(cat);

        // annonymus class Runnable inject
        makeRun(new Runnable() {
            @Override
            public void run() {
                System.out.println("Something run...!");
            }
        });
    }

    static void makeRun(Runnable runnable){
        runnable.run();
    }
}
