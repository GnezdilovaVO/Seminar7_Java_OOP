package homework.controller;

import homework.model.Calculable;

public class UserController {
    private final Calculable calculable;

    public UserController(Calculable calculable) {
        this.calculable = calculable;
    }
    public double sumNumbers(double num1, double num2) {
        return calculable.sum(num1, num2);
    }
    public double difNumbers(double num1, double num2) {
        return calculable.different(num1, num2);
    }
    public double multiNumbers(double num1, double num2) {
        return calculable.multiplication(num1, num2);
    }
    public double divisionNumbers(double num1, double num2) {
        return calculable.division(num1, num2);
    }
}
