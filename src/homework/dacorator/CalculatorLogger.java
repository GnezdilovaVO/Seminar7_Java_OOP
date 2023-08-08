package homework.dacorator;

import homework.model.Calculable;

public class ColculatorLogger implements Calculable {
    private Calculable calculable;
    private Loggable logger;

    public ColculatorLogger(Calculable calculable, Loggable logger) {
        this.calculable = calculable;
        this.logger = logger;
    }

    @Override
    public double sum(double num1, double num2) {
        return 0;
    }

    @Override
    public double different(double num1, double num2) {
        return 0;
    }

    @Override
    public double multiplication(double num1, double num2) {
        return 0;
    }

    @Override
    public double division(double num1, double num2) {
        return 0;
    }
}
