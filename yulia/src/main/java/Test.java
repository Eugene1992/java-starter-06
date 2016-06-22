
public class Test {
    public static void main(String[] args) {
        String name = "Tom";

        Human h1 = new Human("Yliya", "Female", 17, 20000);

        Human h2 = new Human();
        h2.name = "Irina";
        h2.gender = "Female";
        h2.age = 17;
        h2.salary = 20000;

        Human h3 = new Human("Eugene", "Female", 50, 1000);

        Human h4 = new Human("Marina", "Female", 90, 50);

        Human h5 = new Human("Max", "Female", 40, 10000);

        Human[] humans = new Human[]{h1, h2, h3, h4, h5};

        System.out.println(h4.getAverageAge(humans));

    }

}
