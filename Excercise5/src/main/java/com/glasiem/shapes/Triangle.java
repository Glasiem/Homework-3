package com.glasiem.shapes;

public class Triangle extends Shape {
    private double a, b, c, ha;

    public Triangle(double a, double b, double c, double ha) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ha = ha;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateSquare() {
        return (a * ha) / 2;
    }
}
