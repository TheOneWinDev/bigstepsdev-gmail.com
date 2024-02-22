import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;

        int[][] matrix = generateRandomMatrix(m, n);
        printMatrix(matrix);

        int maxSumRowIndex = findMaxSumRowIndex(matrix);
        System.out.println("Индекс строки с максимальной суммой: " + maxSumRowIndex);
    }

    public static int[][] generateRandomMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(51); // Случайные числа от 0 до 50
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int findMaxSumRowIndex(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                currentSum += matrix[i][j];
            }

            if (currentSum >= maxSum) {
                maxSum = currentSum;
                maxSumRowIndex = i;
            }
        }

        return maxSumRowIndex;
    }

    public static void task3() {
        int m = 12;
        int n = 8;

        int[][] matrix = generateRandomMatrix(m, n);
        printMatrix(matrix);

        int maxSumRowIndex = findMaxSumRowIndex(matrix);
        System.out.println("Индекс строки с максимальной суммой: " + maxSumRowIndex);
    }
}
