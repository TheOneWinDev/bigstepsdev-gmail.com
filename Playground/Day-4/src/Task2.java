import java.util.Random;

public class Task2 {
    private static int[] mass = new int[100];

    public static void init() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            mass[i] = random.nextInt(1001);
        }
    }

    public static void print() {
        for (int elem : mass) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static int max() {
        int max = Integer.MIN_VALUE;
        for (int elem : mass) {
            if (max < elem)
                max = elem;
        }
        return max;
    }

    public static int min() {
        int min = Integer.MAX_VALUE;
        for (int elem : mass) {
            if (min > elem)
                min = elem;
        }
        return min;
    }

    public static int endByZero() {
        int count = 0;
        for (int elem : mass)
        {
            if (elem % 10 == 0)
                count++;
        }
        return count;
    }

    public static int endByZeroSum() {
        int sum = 0;
        for (int elem : mass)
        {
            if (elem % 10 == 0)
                sum+=elem;
        }
        return sum;
    }

    public static void task2() {
        init();
        print();
        System.out.println("Максимальный элемент массива: " + max());
        System.out.println("Количество элементов оканчивающихся на 0: " + endByZero());
        System.out.println("Сумма элементов оканчивающихся на 0: " + endByZeroSum());
    }
}
