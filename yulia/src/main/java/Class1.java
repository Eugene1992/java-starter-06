/**
 * Created by Student on 6/14/2016.
 */
public class Class1 {
    public static void main(String[] args){
        toReturnString("Yulia", 8,"Hello");
        toReturnString("IRa", 4, "Hello");
        getSequence(1,10,2);
        getSequence(1,10,3);
        getSequence(1,100,10);
        double triangleOneSquare = getTriangleSquare(10, 2);
        System.out.println(getTriangleSquare(10, 2));
    }

    public static void toReturnString(String string, long num, String anotherString){
        for(int i = 0; i < num; i++){
            System.out.println(anotherString);
        }
    }

    public static void getSequence(int start, int end, int step){
        for(int i = start; i < end; i = i + step){
            System.out.print(i + " ");
        }
        System.out.println();


    }

    public static double getTriangleSquare(double side, double height){
        double square = 0.5 * side * height;
        return square;
    }
}
