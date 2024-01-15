import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        task4();
    }

    public static void task4() {
        int[] array = generateRandomArray(10000, 100);
        printArray(array);

        int[] maxSumTriple = findMaxSumTriple(array);
        System.out.println("Максимальная сумма трех соседних элементов: " + maxSumTriple[0]);
        System.out.println("Индекс первого элемента тройки: " + maxSumTriple[1]);
    }

    public static int[] generateRandomArray(int range, int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(range + 1);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static int[] findMaxSumTriple(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;

        for (int i = 0; i < array.length - 2; i++) {
            int currentSum = array[i] + array[i + 1] + array[i + 2];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxSumIndex = i;
            }
        }

        return new int[]{maxSum, maxSumIndex};
    }
}
