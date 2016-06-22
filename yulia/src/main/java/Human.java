/**
 * Created by Student on 6/22/2016.
 */
public class Human {
    String name;
    String gender;
    int age;
    int salary;

    public Human (){
    }
    public Human(String name, String gender, int age, int salary){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public int getAverageAge(Human[] humans){
        int sum = 0;
        for (Human human : humans){
           sum = sum + human.age;
        }
        return sum / humans.length;
    }
}


