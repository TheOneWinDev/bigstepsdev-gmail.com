/*
День 1
        Темы:
        Урок 1: JDK и Hello World.
        Урок 2: Переменные. Примитивные типы данных.
        Урок 3: Строки(String) в Java. Ссылочные типы данных.
        Урок 4: Цикл while.
        Урок 5: Цикл for.
*/


public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.print("JAVA ");
            i++;
        }

        System.out.println();

        for (int k = 0; k < 10; k++) {
            System.out.print("JAVA ");
        }

        System.out.println();

        for (int k = 0; k < 10; k++) {
            System.out.println("JAVA");
        }

        System.out.println();

        int year = 1980;
        System.out.println("year" + " = " + year);
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }

        System.out.println();

        for (int year1 = 1980; year1 <= 2020; year1 += 4) {
            System.out.println("Олимпиада " + year1 + " года");
        }

        System.out.println();
        int k = 5;
        for (int factor = 1; factor <= 9; factor += 1) {
            System.out.println(factor + " x " + k + " = " + (factor * k));
        }
    }
}