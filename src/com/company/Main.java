package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Number> box1 = new Box<>(8.0, 7);

        Box<Float> box2 = new Box<>(12.1F, 10.5F);
        System.out.println("Sum of numbers = " + addition(box1, box2));
        System.out.println("Product of numbers = " + multiplication(box1, box2));


    }

    private static Number multiplication(Box<? extends Number> b1, Box<? extends Number> b2) {
        return b1.getNumber1().doubleValue() * b1.getNumber2().doubleValue()
                * b2.getNumber1().doubleValue() * b2.getNumber2().doubleValue();
    }

    private static Number addition(Box<? extends Number> b1, Box<? extends Number> b2) {
        return b1.getNumber1().doubleValue() + b1.getNumber2().doubleValue()
                + b2.getNumber1().doubleValue() + b2.getNumber2().doubleValue();
    }

}

