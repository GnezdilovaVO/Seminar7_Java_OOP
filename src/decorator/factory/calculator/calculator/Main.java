package decorator.factory.calculator.calculator;

import decorator.factory.calculator.calculator.dec.CalculableVisLoggerFactory;
import decorator.factory.calculator.calculator.dec.CalculatorLogger;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableVisLoggerFactory();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();

    }
}
