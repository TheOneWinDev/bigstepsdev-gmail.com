import java.util.Scanner;

public class Task2 {
    public static void task2(Scanner scanner) {
        double divided, divider;

        while (true) {
            try {
                System.out.println("Введите делимое:");
                divided = Double.parseDouble(scanner.nextLine());

                System.out.println("Введите делитель:");
                divider = Double.parseDouble(scanner.nextLine());

                if (divider == 0) {
                    break;
                }

                System.out.println(divided / divider);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите числа.");
            }
        }

        System.out.println("Задача завершила работу");
    }
}