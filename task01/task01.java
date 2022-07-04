package task01;

/**
 * 1. +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя
 * количество выполняемых действий к минимуму.
 * Пример 1: а = 3, b = 2, ответ: 9
 * Пример 2: а = 2, b = -2, ответ: 0.25
 * Пример 3: а = 3, b = 0, ответ: 1
 * Пример 4: а = 0, b = 0, ответ: не определено
 * Пример 5
 * входные данные находятся в файле input.txt в виде
 * b 3
 * a 10
 * Результат нужно сохранить в файле output.txt
 * 1000
 */

public class task01 {
    public static void main(String[] args) {
        // int a = -3;
        // int b = 2;

        int a = 2;
        int b = -2;

        // int a = 0;
        // int b = 3;

        // int a = 3;
        // int b = 0;

        // int a = 0;
        // int b = 0;

        int result = 1;

        if (a == 0 && b == 0) {
            System.out.println(a + " в степени " + b + " равно: Ошибка возведения в степень");
        } else if (a == 0) {
            System.out.println(a + " в степени " + b + " равно: " + a);
        } else if (b == 0) {
            System.out.println(a + " в степени " + b + " равно: " + result);
        } else if (b > 0) {
            for (int i = 0; i < b; i++) {
                result = result * a;
            }
            System.out.printf("%d в степени %d равно: %d\n", a, b, result);
        } else if (b < 0) {
            double res = result;
            double num = a;
            for (int i = 0; i > b; i--) {
                res = res * (1 / num);
            }
            System.out.println(a + " в степени " + b + " равно: " + res);
        }
    }
}
