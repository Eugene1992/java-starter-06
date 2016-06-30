package oop_03;

public class Rat extends Animal{

    private String ratSpecialField; // какое-то поле присущее только собакам

    public Rat(String name, String catSpecialField) {
        super(name); // вызываем конструктор суперкласса и передаем туда имя
        this.ratSpecialField = catSpecialField;
    }

    // Rat не переопределяет метод makeVoice() родителя
}
