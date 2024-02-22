import java.util.Scanner;

public class Task1 {
    public static void task1(Scanner scanner) {
        String city;

        while (true) {
            System.out.println("Введите название города или 'Stop' для выхода:");
            city = scanner.nextLine();

            if (city.equalsIgnoreCase("Stop")) {
                System.out.println("Выход");
                break;
            }

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
    }
}
