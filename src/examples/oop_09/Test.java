package oop_09;

public class Test {
    public static void main(String[] args) {
        System.out.println("Start prgram!");

        try {
            int i = Integer.parseInt("dsadasd");
        } catch (NumberFormatException nfe) {
            System.out.println("Not a number string.. Try again!");
            /*System.exit(0);*/
            //while (true);
            //for(;;);
        } finally {
            System.out.println("Finally still there");
        }

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("Divide by zero");
        }

        System.out.println("End program");
    }
}
