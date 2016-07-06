package oop_10;

class Ship extends ArraysTimeTest{
    private int outerField;
    private static int staticOuterField;
    private Engine engine = new Engine();

    public class Engine extends NPE{
        public int innerField;

        public void getField(){

        }

    }

    public static class NestedClass {
        public void getField(){

        }
    }

    public void getField(){
         engine.npeMethod();
    }
}
