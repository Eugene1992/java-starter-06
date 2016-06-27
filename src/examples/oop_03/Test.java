package oop_03;

public class Test {
    public static void main(String[] args) {

        // вызов по ссылке типа Cat - методы класса родителя не доступны, только класса Cat
        Cat cat1 = new Cat("Barsik", "Whiskas");
        cat1.makeSomeCatThings();
        cat1.makeVoice();

        // вызов по ссылке базового класса - доступны методы класса родителя и производного класса
        Animal cat2 = new Cat("Murka", "Whiskas");
        cat2.someAnimalMethod();
        cat2.makeVoice();

        Animal rat = new Rat("Splinter", "Cheese");
        rat.makeVoice(); // метод makeVoice() не переопределен в классе Rat, будет вызвана реализация базового класса

    }
}
