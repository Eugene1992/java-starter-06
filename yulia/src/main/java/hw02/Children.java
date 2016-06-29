package hw02;

/**
 * Created by admin on 28.06.2016.
 */
public class Children extends People {

    private String childrenSpecialFiled;

    public Children (String name, String childrenSpecialFiled){
        super(name);
        this.childrenSpecialFiled = childrenSpecialFiled;
    }
    @Override
    public void makeFood(){
        System.out.println("Children " + super.getName() + " seid aaaaaa!");
    }
    @Override
    public void somePeopleMethod(){
        System.out.println("Child " + super.getName() + " is a good boy");

    }
}
