package oop_1;


public class ProductsShop extends Scopes {

    public String nameProduct;
    public int price;

    public ProductsShop(){

    }
    public ProductsShop(String name, String nameProduct, int price){
        super(name);
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public void printNameProduct(String nameProduct, int price) {
        System.out.println("In Product Shop sell " + nameProduct);
        System.out.println("Him price " + price);
    }


    public void someMetod2(String metod){
        System.out.println("Бухать вредно!!!!");

    }
}
