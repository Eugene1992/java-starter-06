/**
 * Created by Student on 6/16/2016.
 */
public class Class3 {
    public static void main(String[] args){


        System.out.println(invertString("America"));
    }

    public static String invertString(String input){
        String result = "";
        char[] chars = input.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            result = result + chars[i];
        }
        return result;
    }
}
