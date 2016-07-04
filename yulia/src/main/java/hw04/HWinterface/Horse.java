package hw04.HWinterface;

public class Horse implements Range {

    public int speed;

    public Horse (int speed) {this.speed = speed;}

    public int getSpeed() {return speed; }

    public int getDistanse (int hours) {return speed * hours;}

    public int countDistanse (int hours, Range range) {return range.getDistanse(hours) ;}
}


