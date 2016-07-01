package hw04;

public class Caterpillar extends Insects {

    public Caterpillar (String name) { super(name);}

    @Override
    public void Run() {System.out.println(super.getName() + " gggg");}

    @Override
    public void Fly() {System.out.println(super.getName() + " not fly");}

    @Override
    public void Color() {System.out.println(super.getName() + "green");}
}
