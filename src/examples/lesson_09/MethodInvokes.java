package lesson_09;

import java.util.Scanner;

public class MethodInvokes {
    public static void main(String[] args) {
        System.out.println(getAverage(3));
        //System.out.println(getInputNum());
        //System.out.println(getInputSum(4));
    }

    static int getInputNum(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

    static int getInputSum(int numOfInputs){
        int sum = 0;
        for (int i = 0; i < numOfInputs; i++) {
            sum = sum + getInputNum();
        }
        return sum;
    }

    static int getAverage(int numOfInputs){
        return getInputSum(numOfInputs) / numOfInputs;
    }
}
