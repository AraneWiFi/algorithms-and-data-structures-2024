package ru.mirea.practice.s23k0130.figure;

class Circle extends Shape {
    public Circle(int x, int y, String color) {
        super(x,y,color);
    }

    public void shape() {
        System.out.println("Фигура: Круг \n"
                + "Позиция: х = " + x
                + " y = " + y
                + "\nЦвет: " + color + "\n");
    }
}
