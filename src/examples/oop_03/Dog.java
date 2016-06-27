package oop_03;

public class Dog extends Animal { // наследуемься с помощью ключевого слова extends

    private String dogSpecialField; // какое-то поле присущее только собакам

    public Dog(String name, String catSpecialField) {
        super(name); // вызываем конструктор суперкласса и передаем туда имя
        this.dogSpecialField = catSpecialField;
    }

    @Override
    public void makeVoice() { // переопределяем метод makeVoice()
        //super.makeVoice(); // если нужн вызвать реализацию суперкласса
        System.out.println("Dog " + super.getName() +  " said gavvvv!"); // получем имя с помощью super из базового класса
    }

    public void makeSomeDogThings(){
        System.out.println("Awwwuu...");
    }
}
