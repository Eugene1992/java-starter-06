/**
 * Created by admin on 22.06.2016.
 */
public class Car {
    String model;
    String name;
    int quantity;
    int age;
    static int staticVariable;

    public Car(){
    }

    public Car(String model, String name, int quantity, int age){
        this.model = model;
        this.name = name;
        this.quantity = quantity;
        this. age = age;
    }

    public int getSumQuantity (Car[] carses){
        int sum = 0;
        for(Car car : carses){
            sum = sum + car.quantity;
        }
        return sum;
    }

    public int getMinAge (Car[] carses){
        int min = 0;
        for (Car car : carses){
            if(min > car.age);
                min = car.age;
            }
            return min;
        }

    public String getModel() {
        return model;
    }

        public void printAllCars(Car[] myBeatifulLittlePony){
        for (Car pony : myBeatifulLittlePony) {
            System.out.println(pony.name + " " + pony.model + " " + pony.age + " " + pony.quantity);
        }
    }

    public static void myBeatifulStaticMethod(){}

    public void printThisObjectName(){
        System.out.println(this.name);
    }

    public static void printThisObjectNameFOrTsatic(Car[] ponyCar, Car singleCar, Car anotherSingleCar){
        System.out.println(ponyCar[1].name);
    }
}


