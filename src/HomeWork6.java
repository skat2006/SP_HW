import java.text.DecimalFormat;
import java.util.ArrayList;
/*
МАССИВЫ ч.2
 */
public class HomeWork6 {
    public static void main(String[] args) {

        int minValue = 100_000;
        int maxValue = 200_000;
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Случайные числа в массиве: ");
        for (int i = 0; i < 30; i++) {
            array.add((int) (Math.random() * ((maxValue - minValue) + 1)) + minValue);
            System.out.print(array.get(i) + ",");
        }
        System.out.println("\n");

        // задача 1
        int totalSum = 0;
        for (Integer value : array) {
            totalSum += value;
        }
        System.out.println("Сумма трат за месяц составила " + new DecimalFormat("###,###").format(totalSum) + " рублей\n");

        // задача 2
        int maxNum = array.get(0);
        int minNum = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < minNum) {
                minNum = array.get(i);
            }
            if (array.get(i) > maxNum) {
                maxNum = array.get(i);
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minNum + " рублей.\nМаксимальная сумма трат за день составила " + maxNum + " рублей");

        // задача 3
        int summary = 0;
        for (Integer value : array) {
            summary += value;
        }
        System.out.println("\nСредняя сумма трат за месяц составила " + (summary/(array.size()-1)) + " рублей");

        // задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
