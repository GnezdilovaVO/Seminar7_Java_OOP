package homework.dacorator;

import homework.model.Calculable;
import homework.log.impl.Loggable;

public class CalculatorLogger implements Calculable {
    private Calculable calculable;
    private Loggable logger;

    public CalculatorLogger(Calculable calculable, Loggable logger) {
        this.calculable = calculable;
        this.logger = logger;
    }

    @Override
    public double sum(double num1, double num2) {
        logger.log("Сумма: ");
        return calculable.sum(num1, num2);
    }

    @Override
    public double different(double num1, double num2) {
        logger.log("Разница: ");
        return calculable.different(num1, num2);
    }

    @Override
    public double multiplication(double num1, double num2) {
        logger.log("Умножение: ");
        return calculable.multiplication(num1, num2);
    }

    @Override
    public double division(double num1, double num2) {
        logger.log("Деление: ");
        return calculable.division(num1, num2);
    }
}
