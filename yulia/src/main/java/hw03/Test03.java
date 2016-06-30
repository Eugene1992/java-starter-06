package hw03;

public class Test03 {
    public static void main (String[] args){

        Animal2 animal2 = Animal2.getInstance();

        System.out.println(animal2.getName());

        Cow cow1 = new Cow();

        System.out.println(cow1.getName());




    }
}
