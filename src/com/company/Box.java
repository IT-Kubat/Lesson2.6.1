package com.company;

public class Box<T extends Number > {
    private T number1;
    private T number2;

    public Box(T n1, T n2){
        number1 = n1;
        number2 = n2;
    }

    public T getNumber1() {
        return number1;
    }

    public T getNumber2() {
        return number2;
    }
}
