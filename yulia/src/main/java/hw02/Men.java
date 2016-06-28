package hw02;

/**
 * Created by admin on 28.06.2016.
 */
public class Men extends People {

    private String menSpecialFiled;

    public Men (String name, String menSpecialFiled){
        super(name);
        this.menSpecialFiled = menSpecialFiled;

        System.out.println("Men" + super.getName() + " bye ");
    }






}
