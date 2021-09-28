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

        // task 4
        // Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести
        // информацию о сытости котов в консоль.
        int numOfCats = 5;
        Cat[] cats = new Cat[numOfCats];
        cats[0] = new Cat("Василий", 35);
        cats[1] = new Cat("Рыжий", 15);
        cats[2] = new Cat("Серый", 10);
        cats[3] = new Cat("Белый", 70);
        cats[4] = new Cat("Черный", 12);
        Plate catsPlate = new Plate(70);
        for(int i = 0; i < numOfCats; i++)
        {
            cats[i].eat(catsPlate);
        }

        for(int i = 0; i < numOfCats; i++)
        {
            cats[i].fullnessInfo();
        }

        // task 5
        catsPlate.addFood(100);
        cats[3].eat(catsPlate);
        cats[4].eat(catsPlate);
        for(int i = 0; i < numOfCats; i++)
        {
            cats[i].fullnessInfo();
        }
    }
}
