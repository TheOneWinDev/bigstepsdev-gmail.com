import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            StepTracker.printMenu();
            Scanner scanner = new Scanner(System.in);
            StepTracker steps = new StepTracker();
            steps.setStepsGoal(8000);
            for (int i = 0; i < 5; i++) {
                int stepsDay = scanner.nextInt();
                steps.setStepsInSomeDay(12, i, stepsDay);
            }
            steps.printStepsInMonth(12);

            if (steps.getAvgStepsInMonth(12) < steps.StepsGoal)
                System.out.println("Goal is not achieved");
            else
                System.out.println("Goal is achieved");
        }
    }