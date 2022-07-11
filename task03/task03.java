// +Написать программу вычисления n-ого треугольного числа. 

import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        int T = num * (num + 1) / 2;

        System.out.printf("Triangular Number: %d \n", T);
        in.close();
    }
}
