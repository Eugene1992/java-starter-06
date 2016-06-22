
import hw01.Cars;

/**
 * Created by admin on 22.06.2016.
 */
public class Test1 {
    public static void main (String[] args){

        Cars c1 = new Cars("Toyota", "Camry", 20, 2);
        Cars c2 = new Cars("Lexus", "is350", 5, 5);
        Cars c3 = new Cars("Honda", "Civic", 10, 6);
        Cars c4 = new Cars("Honda", "CRV", 7, 4);
        Cars c5 = new Cars("Hyundai", "Accent", 5, 2);

        Cars[] carses = new Cars[] {c1, c2, c3, c4, c5};

        System.out. println(c1.getSumQuantity (carses));
        System.out.println(c1.getMinAge (carses));
        System.out.println(c1.getModel());




    }
}
