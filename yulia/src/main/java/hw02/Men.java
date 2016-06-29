package hw02;

/**
 * Created by admin on 28.06.2016.
 */
public class Men extends People {

    private String menSpecialFiled;
    private String menSpecialFiled1;
    private String menSpecialFiled2;
    private String menSpecialFiled3;

    public Men (String name, String menSpecialFiled){
        super(name);
        this.menSpecialFiled = menSpecialFiled;

        System.out.println("Men" + super.getName() + " bye!" + menSpecialFiled);
    }

    public String getMenSpecialFiled() {
        return menSpecialFiled;
    }

    public void print(){
        System.out.println(menSpecialFiled + " " + menSpecialFiled1 + getMenSpecialFiled());
    }
}
