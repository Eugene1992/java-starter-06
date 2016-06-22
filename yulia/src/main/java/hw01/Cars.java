package hw01;

/**
 * Created by admin on 22.06.2016.
 */
public class Cars {
    String model;
    String name;
    int quantity;
    int age;

    public Cars (){
    }
    public Cars (String model, String name, int quantity, int age){
        this.model = model;
        this.name = name;
        this.quantity = quantity;
        this. age = age;
    }
    public int getSumQuantity (Cars[] carses){
        int sum = 0;
        for(Cars cars : carses){
            sum = sum + cars.quantity;
        }
        return sum;
    }
    public int getMinAge (Cars[] carses){
        int min = 0;
        for (Cars cars : carses){
            if(min > cars.age);
                min = cars.age;
            }
            return min;
        }

    public String getModel() {
        return model;
    }
}


