import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер этажа: ");
        int flat = scanner.nextInt();
        if (flat <= 0) {
            System.out.println("Ошибка ввода");
        } else if (flat <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (flat <= 8) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }

        System.out.println("Введите числа a и b");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Некорректный ввод");
        }

        for (int i = a + 1; i < b; i++) {
            if ((i % 5 == 0) && (i % 10 != 0))
                System.out.println(i);
        }

        System.out.println();

        int temp = a + 1;
        while (temp < b) {
            if ((temp % 5 == 0) && (temp % 10 != 0))
                System.out.println(temp);
            temp++;
        }

        double y = 0D;
        double x;
        while (y != 420) {
                x = scanner.nextDouble();
                if (x >= 5.) {
                    y = (x * x - 10) / (x + 7);
                } else if (x > -3. && x < 5.) {
                    y = (x + 3) * (x * x - 2);
                } else {
                    y = 420;
                }
                System.out.println(y);
        }

        scanner.close();
    }
}