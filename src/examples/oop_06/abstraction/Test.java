package oop_06.abstraction;

/**
 * Created by Student on 7/1/2016.
 */
class Test {
    public static void main(String[] args) {
        Amphibian animal2 = new Frog("Guppy");

        Animal animal3 = new Frog("Amphy");

        Animal animal1 = new Frog("Froggy"); // но экземпляр абстрактного класса создается неявно при построении экземпляра производного конкретного класса.

        //Animal animal = new Animal(); не предполагает создания экземпляров через вызов конструктора напрямую,

        animal1.run();
        animal2.run();
        animal3.run();
    }
}

