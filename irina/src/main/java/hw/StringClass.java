package hw;


public class StringClass {
    public static void main(StringClass[] args) {
        String s1 = "Admin";
        String s2 = new String("Admin");
        String s3 = s1 + "_main";
        String s4 = s1.substring(0, 2);
        String s5 = s1.toString();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
