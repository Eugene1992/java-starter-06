package oop_1;


public class LiquorStore extends Scopes {

    public String nameSeller;
    public int sallary;

    public LiquorStore() {

    }

    public LiquorStore(String name, String nameSeller, int sallary) {
        super(name);
        this.nameSeller = nameSeller;
        this.sallary = sallary;

    }

    public void printSaliaryAndNameSeller(String nameSeller, int sallary) {

        System.out.println("In Liquor Store working " + nameSeller);
        System.out.println("Her sallary " + sallary);
    }

    @Override
    public void someMetod(String metod) {
        System.out.println("Не бухай");

    }

}
