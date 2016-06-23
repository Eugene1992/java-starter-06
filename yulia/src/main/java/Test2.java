import hw01.Travel;

/**
 * Created by admin on 23.06.2016.
 */
public class Test2 {
    public static void main(String[] args){

        Travel t1 = new Travel("Brazil", "Rio", 20, 1450.50);
        Travel t2 = new Travel("America", "LA", 30, 2050.80);
        Travel t3 = new Travel("Italy", "Roma", 15, 800.90);
        Travel t4 = new Travel("Iceland", "Reykjavik", 15, 1000.50);
        Travel t5 = new Travel("Cuba", "Havana", 20, 1050.20);

        Travel[] travels = new Travel[] {t1, t2, t3, t4, t5};


    }


}
