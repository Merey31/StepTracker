import java.util.Scanner;

//where logic(?) is going to take place and statistics is going to be shown here
public class StepTracker {
    Scanner scanner = new Scanner(System.in);
    MonthData[] monthToData = new MonthData[12];

    StepTracker(Scanner step) {
        scanner = step;

        for(int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
}

//month, day, steps
void addNewNumberStepsPerDay(int month, int day, int steps) {
    if ((month < 0) || (month > 12)) {
        System.out.println("month is not in the range");
        return;

    } else if ((day < 0) || (day > 30)) {
        System.out.println("day is not in the range");
        return;

    } else if (steps < 0) {
        System.out.println("steps cannot be negative");
        return;

    }
}