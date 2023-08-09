package homework;

import homework.controller.UserController;
import homework.dacorator.CalculatorLogger;
import homework.model.impl.Calculator;
import homework.view.UserView;

public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController(new Calculator());
        UserView calculator = new UserView(controller);
        calculator.run();

    }
}
