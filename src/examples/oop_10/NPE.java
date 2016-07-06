package oop_10;

import java.io.File;
import java.io.IOException;

/**
 * Created by Student on 7/6/2016.
 */
public class NPE {
    public static void main(String[] args) {
        String s = null;
        File f = new File("D:/newFile.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void npeMethod(){

    }
}
