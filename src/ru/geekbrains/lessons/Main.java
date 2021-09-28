package ru.geekbrains.lessons;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);

        plate.info();
        cat.eat(plate);
        plate.info();
        Cat murka = new Cat("Мурка", 105);
        murka.eat(plate);
    }
}
