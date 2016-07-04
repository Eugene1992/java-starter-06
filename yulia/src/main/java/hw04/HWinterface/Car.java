package hw04.HWinterface;


public class Car implements Libra, Range {

    private int speed;
    public  int mas;

    public Car(int speed, int mas) {
        this.speed = speed;
        this.mas = mas;

    }

    public int getSpeed() {
        return speed;
    }

    public int getDistanse ( int hourse){
        return speed * hourse;
    }

    public int getWeight(int lb) {
        return mas * lb;
    }

    public int countDistanse (int hourse, Range range) {
        return range.getDistanse(hourse);
    }

    public int countWeight (int lb, Libra libra){
        return libra.getWeight(lb);
    }
}
