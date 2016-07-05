package hw04;

public class Caterpillar extends Insects {

    public Caterpillar(String name) {
        //super(name);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " gggg");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " not fly");
    }

    @Override
    public void color() {
        System.out.println(super.getName() + "green");
    }
}
