package oop_08;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ira", 18, "Female");
        Employee e2 = new Employee("Ira", 18, "Female");

        /*int hc1 = e1.hashCode();
        int hc2 = e2.hashCode();
        System.out.println(hc1);
        System.out.println(hc2);
*/
        //System.out.println(e1.equals(e2));

        System.out.println(e1.toString());
    }
}
