package hw04;


public class Test {
    public static void main (String[] args){

        Insects insects1 = new Caterpillar(" гусень ");

        Insects insects2 = new Caterpillar( " хочу стать жуком");

        Insects insects3 = new Caterpillar( " green ");

        insects1.Fly();
        insects2.Run();
        insects3.Color();



    }
}
