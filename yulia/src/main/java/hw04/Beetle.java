package hw04;

/**
 * Created by admin on 01.07.2016.
 */
public abstract class Beetle extends Insects {


    public Beetle(String name) {
        super(name);
    }

    protected Beetle() {
    }

    public abstract void beetleMethod();
}
