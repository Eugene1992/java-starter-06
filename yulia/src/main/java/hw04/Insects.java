package hw04;

public abstract class Insects {
    public String name;

    public Insects(){
    }
    public Insects (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void Fly();

    protected abstract void Color();

    public abstract void Run();

}
