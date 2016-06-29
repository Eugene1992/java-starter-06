package hw02;

public class People {

    private String name;

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeFood() {
        System.out.println("People like to eat");
    }

    protected void somePeopleMethod() {
        System.out.println("All people like to eat well!");
    }
}
