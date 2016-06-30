package hw02;

/**
 * Created by admin on 28.06.2016.
 */
public class Woman extends People {

    private String womanSpecialField;

    public Woman(String name, String womanSpecialField) {
        super(name);
        this.womanSpecialField = womanSpecialField;

        System.out.println("Woman" + "\b" + super.getName() + "\b" + "Hello");
    }

    public void makeSomeWomanThings() {
        System.out.println("I want to the sea");
    }
}
