package ru.geekbrains.lessons;

public class Cat {
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        System.out.println("cate create: " + name + " " + appetite);
    }
    public void eat(Plate p) {
        System.out.println("cate eat: " + name);
        if (p.decreaseFood(appetite)) {
            System.out.println(appetite + " food");
        }
        else
        {
            System.out.println("not enough food in plate");
        }

    }

    public int getAppetite() {
        System.out.println("cate get Appetite: "+ name + " " + appetite);
        return appetite;
    }
}
