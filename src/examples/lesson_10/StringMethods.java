package lesson_10;

public class StringMethods {
    public static void main(String[] args) {
        String s = "North Ireland";

        //System.out.println(s.equals("North Ireland"));
        //System.out.println(s.equals("North Irelanddddddd"));
        //System.out.println(s.equals("NORTH IRELAND"));
        //System.out.println(s.equalsIgnoreCase("NOrTH IRELAND"));

        //System.out.println(s.charAt(3));

        //ystem.out.println(s.compareTo("America"));
        //System.out.println(s.compareTo("Orlando"));
        //System.out.println(s.compareTo("North Ireland"));
        //System.out.println(s.compareToIgnoreCase("NorTh IreLAND"));

        /*System.out.println(s.concat(" sucks"));
        System.out.println(s + " sucks");*/

        //System.out.println(s.contains("North"));
        //System.out.println(s.contains("and"));
        //System.out.println(s.contains("a"));
        //System.out.println(s.contains("West"));

        //System.out.println(s.endsWith("land"));
        //System.out.println(s.endsWith("lands"));

        char c = ' ';
        System.out.println((int)c);
        System.out.println((int)'o');
        System.out.println((int)'O');

        byte[] sBytes = s.getBytes();
        for (byte sByte : sBytes) {
            System.out.print(sByte + " ");
        }

        System.out.println();

        char[] sChars = s.toCharArray();
        for (char sChar : sChars) {
            System.out.print(sChar + " ");
        }

        //System.out.println(subStrting(0, 2, "America"));

        //System.out.println(s.indexOf('r'));
        //System.out.println(s.indexOf('r', 4));
        //System.out.println(s.indexOf("Ireland"));

        //String emptyString = "";
        //System.out.println(s.isEmpty());
        //System.out.println(emptyString.isEmpty());

        //System.out.println(s.length());

        //System.out.println(s.toLowerCase());
        //System.out.println(s.toUpperCase());

        //String trimString = "     String with spaces    ";
        //System.out.println(trimString);
        //System.out.println(trimString.trim());

        /*String[] strings = s.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }*/

        //System.out.println(s.replace("North", "East"));


    }

    static String subStrting(int start, int end, String inputStr){
        char[] chars = inputStr.toCharArray();
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + chars[i];
        }
        return result;
    }
}