package oop_09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Student on 7/5/2016.
 */
public class CheckedExxepExample {
    public static void main(String[] args) {
        //System.out.println(10 / 0);
        //getSomethingTryCatch();
        //getSomethingThrows();
        try {
            validateAge(-20);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
    }

    static void getSomethingTryCatch(){
        try {
            FileInputStream fis = new FileInputStream("B:/myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void throwMethod() throws FileNotFoundException {
        getSomethingThrows();
    }

    static void getSomethingThrows() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("B:/myfile.txt");
    }

    static void validateAge(int age) throws IllegalAgeException {
        if(age < 0) {
            throw new IllegalAgeException("Negative age value");
        } else {
            System.out.println(age);
        }

    }
}
