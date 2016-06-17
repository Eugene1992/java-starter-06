package Classwork;

/**
 * Created by Student on 6/17/2016.
 */
public class StringExamples {
    public static void main(String[] args){

        String s = "Captain America";
        System.out.println(getStringInvert(s));
    }
    public static String getStringInvert (String invert){
        String result = "";
        char[] chars = invert.toCharArray();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            result = result + chars[i];
        }
        return result;
    }
}
