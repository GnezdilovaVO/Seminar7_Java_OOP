package homework.model.impl;

import homework.model.Calculable;

public class Calculator implements Calculable {

    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double different(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double division(double num1, double num2) {
        return num1 / num2;
    }
}
