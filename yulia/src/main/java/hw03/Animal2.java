package hw03;

public class Animal2 {

    public Animal2() {
    }

    private String name;

    public Animal2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void makeVoise() {
        System.out.println(" MUUU ");
    }

    protected void getSomeFood() {
        System.out.println(" milk");
    }

    public void makeSomeAnimal2Method() {
        System.out.println(" meat");
    }
    private static Animal2 ourInstance = new Animal2("pig");

    public static Animal2 getInstance() {return ourInstance;}









}
