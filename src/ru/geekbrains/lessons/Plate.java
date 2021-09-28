package ru.geekbrains.lessons;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
        System.out.println("plate created with food: " + food);
    }

    public void info() {
        System.out.println("plate info: " + food);
    }

    public int getFood() {
        System.out.println("plate getFood: " + food);
        return food;
    }

    public void setFood(int food) {
        System.out.println("plate set Food: " + food);
        if (food >= 0)
            this.food = food;
    }

    public boolean decreaseFood(int n) {
        System.out.println("plate decrease Food: " + n);
        if (food >= n) {
            food -= n;
            return true;
        }
        return false;
    }
}
