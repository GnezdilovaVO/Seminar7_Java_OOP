package homework.view;

import homework.controller.UserController;

import java.util.Scanner;

public class UserView {

    private UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        double num1 = promptDouble("Введите первый аргумент: ");
        while (true) {
            String cmd = prompt("Введите команду (+, -, *, /) : ");
            double num2 = promptDouble("Введите второй аргумент: ");
            if (cmd.equals("+")) {
                System.out.println("Результат: " + userController.sumNumbers(num1, num2));
                break;
            }
            if (cmd.equals("-")) {
                System.out.println("Результат: " + userController.difNumbers(num1, num2));
                break;
            }
            if (cmd.equals("*")) {
                System.out.println("Результат: " + userController.multiNumbers(num1, num2));
                break;
            }
            if (cmd.equals("/")) {
                System.out.println("Результат: " + userController.divisionNumbers(num1, num2));
                break;
            }

        }


    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
