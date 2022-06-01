/*
ЦИКЛЫ
 */
public class HomeWork4 {
    public static void main(String[] args) {
        // Задание 1
        int index = 0;

        while (index < 10) {
            index++;
            System.out.print(index + " ");
        }
        System.out.println();
        for (; index > 0; index--) {
            System.out.print(index + " ");
        }
        System.out.println("\nTask1 done!\n");

        // Задание 2
        int firstFriday = 3;

        for (index = firstFriday; index <= 31; index++) {
            if (index == firstFriday || (index - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + index + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println("Task2 done!\n");

        // Задание 3
        int year = 2022;
        int cometPeriod = 79, minCalcDelta = 200, maxCalcDelta = 100;
        int minCalcYear = year - minCalcDelta;
        int maxCalcYear = year + maxCalcDelta;

        for (int yearCalc = 0; yearCalc <= maxCalcYear; yearCalc += cometPeriod) {
            if (yearCalc > minCalcYear) {
                System.out.println(yearCalc);
            }
        }
        System.out.println("Task3 done!\n");

        // Здание 4
        for (int i = 1; i < 31; i++) {
            String outString = "";
            if (i % 3 == 0) {
                outString += " ping";
            }
            if (i % 5 == 0) {
                outString += " pong";
            }
            System.out.println(i + ": " + outString);
        }
        System.out.println("Task4 done!\n");

        // Задание 5
        int current = 0, next = 1;

        for (int i = 0; i < 10; i = i + 2) {
            System.out.print(current + " ");
            System.out.print(next + " ");
            current += next;
            next += current;
        }
        System.out.println("\nTask5 done!\n");
    }
}
