package decorator.factory.calculator.calculator.dec;

import decorator.factory.calculator.calculator.Calculable;
import decorator.factory.calculator.calculator.Calculator;
import decorator.factory.calculator.calculator.ICalculableFactory;
import decorator.factory.calculator.log.impl.ConsoleLogger;

public class CalculableVisLoggerFactory implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLogger(new Calculator(primaryArg), new ConsoleLogger());
    }
}
