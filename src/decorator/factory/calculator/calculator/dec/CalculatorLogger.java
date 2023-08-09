package decorator.factory.calculator.calculator.dec;

import decorator.factory.calculator.calculator.Calculable;
import decorator.factory.calculator.log.Loggable;

public class CalculatorLogger implements Calculable {
    private Calculable calculator;
    private Loggable logger;

    public CalculatorLogger(Calculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Сумма чисел: %d - %d", calculator.getResult(), arg));
        return calculator.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Произведение чисел: %d - %d", calculator.getResult(), arg));
        return calculator.multi(arg);
    }

    @Override
    public int getResult() {
        logger.log(String.format("Результа = %d", calculator.getResult()));
        return calculator.getResult();
    }
}
