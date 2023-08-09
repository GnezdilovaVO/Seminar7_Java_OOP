package decorator.factory.calculator.calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
