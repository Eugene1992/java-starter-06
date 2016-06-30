package hw02;

/**
 * Created by admin on 28.06.2016.
 */
public class Woman extends People {

    private String womanSpecialFiled;

    public Woman (String name, String womanSpecialFiled){
        super(name);
        this.womanSpecialFiled = womanSpecialFiled;

        System.out.println("Woman" +  super.getName() + "\n" + "Hello");
    }


    public void makeSomeWomanThings() {System.out.println("I want to the sea");}

}
