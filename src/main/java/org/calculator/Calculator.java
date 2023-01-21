package org.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число, знак (+, -, *, /), второе число:");
        Scanner console = new Scanner(System.in);
        String stroka = console.nextLine();

        String[] plus = stroka.split("\\+");
        String[] minus = stroka.split("-");
        String[] multiply = stroka.split("\\*");
        String[] divide = stroka.split("/");

        if ((plus.length == 1) && (minus.length == 1) && (multiply.length == 1) && (divide.length == 1)) {
            throw new NumberFormatException("Строка не является математической операцией или введите знак (+, -, *, /)");
        } else if ((plus.length > 2) || (minus.length > 2) || (multiply.length > 2) || (divide.length > 2)) {
            throw new NumberFormatException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        ArithmeticCalculations arithmeticCalculations = new ArithmeticCalculations();

        arithmeticCalculations.plusAction(plus);

        arithmeticCalculations.minusAction(minus);

        arithmeticCalculations.multipleAction(multiply);

        arithmeticCalculations.divideAction(divide);

    }
}
