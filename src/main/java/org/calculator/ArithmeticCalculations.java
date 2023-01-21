package org.calculator;

public class ArithmeticCalculations {
    Converter converter = new Converter();

    public void plusAction(String[] plus) {
        if (plus.length == 2) {
            try {
                int a = Integer.parseInt(plus[0]);
                int b = Integer.parseInt(plus[1]);
                if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                    int result = a + b;
                    System.out.println(result);
                } else {
                    throw new NumberFormatException("Число должно быть в промежутке от 1 до 10 включительно");
                }
            } catch (NumberFormatException numberFormatException) {
                int a = converter.romanToArabic(plus[0]);
                int b = converter.romanToArabic(plus[1]);
                if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                    int result = a + b;
                    String c = converter.arabicToRoman(result);
                    System.out.println(c);
                } else if (((a < 0) && !(b < 0)) || (!(a < 0) && (b < 0))) {
                    throw new NumberFormatException("Используются одновременно разные системы счисления");
                } else {
                    throw new NumberFormatException("Число должно быть в промежутке от I до X включительно");
                }
            }
        }
    }

    public void minusAction(String[] minus) {
        if (minus.length == 2) {
            try {
                int a = Integer.parseInt(minus[0]);
                int b = Integer.parseInt(minus[1]);
                if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                    int result = a - b;
                    System.out.println(result);
                } else {
                    throw new NumberFormatException("Число должно быть в промежутке от 1 до 10 включительно");
                }
            } catch (NumberFormatException numberFormatException) {
                int a = converter.romanToArabic(minus[0]);
                int b = converter.romanToArabic(minus[1]);
                if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                    int result = a - b;
                    String c = converter.arabicToRoman(result);
                    System.out.println(c);
                } else if (((a < 0) && !(b < 0)) || (!(a < 0) && (b < 0))) {
                    throw new NumberFormatException("Используются одновременно разные системы счисления");
                } else {
                    throw new NumberFormatException("Число должно быть в промежутке от I до X включительно");
                }
            }
        }
    }

    public void multipleAction(String[] multiply) {
        if (multiply.length == 2) {
            try {
                int a = Integer.parseInt(multiply[0]);
                int b = Integer.parseInt(multiply[1]);
                if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                    int result = a * b;
                    System.out.println(result);
                } else {
                    throw new NumberFormatException("Число должно быть в промежутке от 1 до 10 включительно");
                }
            } catch (NumberFormatException numberFormatException) {
                int a = converter.romanToArabic(multiply[0]);
                int b = converter.romanToArabic(multiply[1]);
                if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                    int result = a * b;
                    String c = converter.arabicToRoman(result);
                    System.out.println(c);
                } else if (((a < 0) && !(b < 0)) || (!(a < 0) && (b < 0))) {
                    throw new NumberFormatException("Используются одновременно разные системы счисления");
                } else {
                    throw new NumberFormatException("Число должно быть в промежутке от I до X включительно");
                }
            }
        }
    }

    public void divideAction(String[] divide) {
        if (divide.length == 2) {
            try {
                int a = Integer.parseInt(divide[0]);
                int b = Integer.parseInt(divide[1]);
                if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                    int result = a / b;
                    System.out.println(result);
                } else {
                    throw new NumberFormatException("Число должно быть в промежутке от 1 до 10 включительно");
                }
            } catch (NumberFormatException numberFormatException) {
                int a = converter.romanToArabic(divide[0]);
                int b = converter.romanToArabic(divide[1]);
                if ((a > 0 && a <= 10) && (b > 0 && b <= 10)) {
                    int result = a / b;
                    String c = converter.arabicToRoman(result);
                    System.out.println(c);
                } else if (((a < 0) && !(b < 0)) || (!(a < 0) && (b < 0))) {
                    throw new NumberFormatException("Используются одновременно разные системы счисления");
                } else {
                    throw new NumberFormatException("Число должно быть в промежутке от I до X включительно");
                }
            }
        }
    }
}

