import java.util.ArrayList;
import java.util.HashMap;

public class StepTracker {
    public static HashMap<Integer, ArrayList<Integer>> StepsInYear = new HashMap<>();
    public static Integer StepsGoal = 10000;

    public static void printMenu()
    {
        System.out.println("Ввести данные по шагам за месяц");
        System.out.println("Посчитать калории за данный месяц");
        System.out.println("Выполнена ли цель по шагам за данный месяц");
        System.out.println("Посчитать среднее число шагов за данный месяц");
    }

    public StepTracker() {
        for (int month = 1; month <= 12; month++) {
            ArrayList<Integer> stepsList = new ArrayList<>();

            for (int day = 1; day <= 30; day++) {
                stepsList.add(0);
            }

            StepsInYear.put(month, stepsList);
        }
    }

    public void setStepsGoal(int newGoal)
    {
        StepsGoal = newGoal;
    }

    public void setStepsInSomeDay(int month, int day, int steps) {
        ArrayList<Integer> stepsList = StepsInYear.get(month);

        if (stepsList != null && day >= 0 && day < 30) {
            stepsList.set(day, steps);
        } else {
            System.out.println("Invalid month or day.");
        }
    }


    public void printStepsInMonth(int month)
    {
        ArrayList<Integer> stepsList = StepsInYear.get(month);
        System.out.println(stepsList.toString());
    }

    public double getAvgStepsInMonth(int month) {
        ArrayList<Integer> stepsList = StepsInYear.get(month);
        double sum = 0;

        // Change the loop to start from 0
        for (int i = 0; i < 30; i++) {
            sum += stepsList.get(i);
        }

        return sum / 30;
    }

    public double CountKiloCaloriesInMonth(int month) {
        ArrayList<Integer> stepsList = StepsInYear.get(month);
        double sum = 0;

        // Change the loop to start from 0
        for (int i = 0; i < 30; i++) {
            sum += stepsList.get(i);
        }

        return sum * 50 / 1000;
    }

    public double CountAvgKiloCaloriesInMonth(int month) {
        return CountKiloCaloriesInMonth(month) / 30;
    }
}