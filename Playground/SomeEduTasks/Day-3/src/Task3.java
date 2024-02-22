import java.util.Scanner;
public class Task3 {
    public static void task3(Scanner scanner)
    {
        for (int i = 0; i < 5; i++) {
            double divided, divider;

            try {
                System.out.println("Введите делимое:");
                divided = Double.parseDouble(scanner.nextLine());

                System.out.println("Введите делитель:");
                divider = Double.parseDouble(scanner.nextLine());

                if (divider == 0) {
                    System.out.println("Деление на 0.");
                    continue;
                }

                System.out.println(divided / divider);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите числа.");
                continue;
            }
        }

        System.out.println("Задача завершила работу");
    }
}
