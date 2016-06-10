/**
 * Created by admin on 10.06.2016.
 */
public class NewClass {
    public static void main(String[] args) {

        for(int i = 0; i < 50; i++){
            if(i % 3 == 0);
            System.out.println(i);
        }

        int i = 0;
        while (i < 50){
            System.out.print (i + " "); /* +""" разделение между цифрами  */
            i++;
        }

        int c = 0;
        do {
            c++;
            System.out.print(c + " ");
        }while (c < 50);

        System.out.println();

        int orel = 0;
        int rezhka = 0;
        for(int e = 0; e < 1000; e++ ){
            int rand = (int)(Math.random()*99);
            if(rand % 2 == 0){
                rezhka = rezhka + 1;
            }
            else{
                orel = orel + 1;
            }
        }
        System.out.println("Orel = " + orel);
        System.out.println("Rezhka = " + rezhka);

    }
}
