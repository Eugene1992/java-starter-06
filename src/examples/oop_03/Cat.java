package oop_03;

public class Cat extends Animal{ // наследуемься с помощью ключевого слова extends

    private String catSpecialField; // какое-то поле присущее только котам

    public Cat(String name, String catSpecialField) {
        super(name); // вызываем конструктор суперкласса и передаем туда имя
        this.catSpecialField = catSpecialField;
    }

    @Override
    public void makeVoice() { // переопределяем метод makeVoice()
        //super.makeVoice(); // если нужн вызвать реализацию суперкласса
        System.out.println("Cat " + super.getName() + " said myawwww!"); // получем имя с помощью super из базового класса
    }

    public void makeSomeCatThings(){
        System.out.println("Mrrrrr...");
    }
}
