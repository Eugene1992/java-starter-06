package oop_1;


public class Test_Scopes {

    public Test_Scopes() {
    }

    public static void main(String[] args) {

        LiquorStore liquor = new LiquorStore();
        Scopes scope = new Scopes();
        ProductsShop product = new ProductsShop();
        Scopes metod = new LiquorStore();
        Scopes metod2 = new ProductsShop();

        liquor.printSaliaryAndNameSeller("Irina", 100);
        scope.printName("buhlo");
        product.printNameProduct("Milk", 20);
        metod.someMetod("");
        metod2.someMetod2("");


    }
}
