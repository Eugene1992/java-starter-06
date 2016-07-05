package hw04;

public abstract class Insects {
    public String name;

    public Insects(String name) {
        this.name = name;
    }

    protected Insects() {
    }

    public String getName() {
        return name;
    }

    public abstract void fly();

    protected abstract void color();

    public abstract void run();

}
