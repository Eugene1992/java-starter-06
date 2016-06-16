import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Student on 6/15/2016.
 */
public class Class2 {
    public static void main(String[] args){
         System.out.println(getInputSum(5));
    }

    public static int getInputNam(){
        Scanner scanner = new Scanner (System.in);
        int i = scanner.nextInt();
        return i;
    }
    public static int getInputSum(int numOfInput){
        int sum = 0;
        for(int i = 0; i < numOfInput; i++){
            sum = sum + getInputNam();
        }
        return sum / numOfInput;
    }
}
