/**
 * Created by admin on 22.06.2016.
 */
public class Test1 {
    public static void main (String[] args){

        Car c1 = new Car("Toyota", "Camry", 20, 2);
        Car c2 = new Car("Lexus", "is350", 5, 5);
        Car c3 = new Car("Honda", "Civic", 10, 6);
        Car c4 = new Car("Honda", "CRV", 7, 4);
        Car c5 = new Car("Hyundai", "Accent", 5, 2);
        Car c6 = new Car();

        /*System.out.println(c6.age);
        System.out.println(c6.name);
        System.out.println(c6.model);
        System.out.println(c6.quantity);*/

        Car[] carses = new Car[] {c1, c2, c3, c4, c5};

        //c3.printAllCars(carses);

        Car.myBeatifulStaticMethod();

        c5.printThisObjectName();

        String s = new String("dsdsds");

        //Car.printThisObjectNameFOrTsatic(carses, c2, c1);

        //System.out.println(c1.model);


        /*System.out. println(c1.getSumQuantity (carses));
        System.out.println(c1.getMinAge (carses));
        System.out.println(c1.getModel());*/




    }
}
