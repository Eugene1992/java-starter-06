package hw04.HWinterface;


public class Test {
    public static void main (String[] args){

        Car car = new Car(10, 30);
        Horse horse = new Horse(5);
        Car car1 = new Car(56, 100);

       System.out.println(car.countDistanse(2, car));
       System.out.println(horse.countDistanse(5, horse));
       System.out.println(car1.countWeight(300, car1));

       GodsBug godsBug = new GodsBug();


    }
}
