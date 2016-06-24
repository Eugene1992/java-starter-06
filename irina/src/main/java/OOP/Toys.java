package OOP;

/**
 * Created by Irinka on 23.06.2016.
 */
public class Toys {
    private int id;
    private String name;
    private double price;
    private boolean defect;

    public  Toys(){

    }

    /*public  Toys(int id, String name, double price, boolean defect){
        this.id = id;
        this.defect = defect;
        this.name = name;
        this.price = price;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public void setDefect(boolean defect) {
        this.defect = defect;
    }

    public void getId(int id){

    }
    public void getName(String name){

    }
    public void getPrice(double price){

    }
    public void getDefect(boolean defect){

    }

    public double totalAmount(Toys [] toyses) {
        double total = 0;
        for (Toys toyse : toyses) {
            total += toyse.price;

        }
        return total;
    }
    public int amountDefect(Toys[] toyses){
        int amount = 0;
        for (Toys toyse : toyses) {
            if (toyse.defect == true){
                amount++;
            }
        }
        return amount;
    }
}
