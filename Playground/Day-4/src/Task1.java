public class Task1 {
    public static void init(int[] massInt) {
        for (int i = 0; i < 11; i++)
            massInt[i] = i;
    }

    public static void print(int[] massInt) {
        for (int elem : massInt)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static int countLen(int[] massInt) {
        return massInt.length;
    }

    public static int moreThanEight(int[] massInt) {
        int count = 0;
        for (int elem : massInt) {
            if (elem > 8)
                count++;
        }
        return count;
    }

    public static int equalToOne(int[] massInt) {
        int count = 0;
        for (int elem : massInt) {
            if (elem == 1)
                count++;
        }
        return count;
    }

    public static int countEven(int[] massInt) {
        int count = 0;
        for (int elem : massInt) {
            if (elem % 2 == 0)
                count++;
        }
        return count;
    }

    public static int countNotEven(int[] massInt) {
        int count = 0;
        for (int elem : massInt) {
            if (elem % 2 != 0)
                count++;
        }
        return count;
    }

    public static int sum(int[] massInt) {
        int sum = 0;
        for (int elem : massInt) {
            sum += elem;
        }
        return sum;
    }

    public static void task1() {
        int[] massInt = new int[11];
        Task1.init(massInt);
        Task1.print(massInt);
        System.out.println("Длина массива: " + Task1.countLen(massInt));
        System.out.println("Число четных элементов: " + Task1.countEven(massInt));
        System.out.println("Количество нечетных элементов: " + Task1.countNotEven(massInt));
        System.out.println("Количество чисел больших 8: " + Task1.moreThanEight(massInt));
        System.out.println("Количество чисел равных 1: " + Task1.equalToOne(massInt));
        System.out.println("Сумма элементов массива: " + Task1.sum(massInt));
    }
}
