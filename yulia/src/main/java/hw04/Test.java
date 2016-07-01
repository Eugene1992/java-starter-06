package hw04;


public class Test {
    public static void main (String[] args){

        Insects insects1 = new Caterpillar(" гусень ");

        Insects insects2 = new Caterpillar( " хочу стать жуком");

        Insects insects3 = new Caterpillar( " green ");

        insects1.Fly();
        insects2.Run();
        insects3.Color();

        Insects insects4 = new Beetle( " new") {
            @Override
            public void Fly() {System.out.println();
            }
            @Override
            protected void Color() {System.out.println();
            }
            @Override
            public void Run() {System.out.println();

            }
        }


    }
}
