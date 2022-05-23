public class HomeWork2 {
    public static void main(String[] args) {
// задача 1
        byte by = 1;
        short sh = 10;
        int in = 100;
        long ll = 1000L;

        float fl = 0.1f;
        double dd = 0.01;

        char ch1 = 'c';
        char ch2 = 99;
        String s = "Task1 done!\n";

        boolean bool = ll > by;

        System.out.println(s);

        // задача 2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float summaryWeight = boxer1 + boxer2;
        float weightDiffer = Math.abs(boxer1 - boxer2);

        System.out.println("Общий вес боксеров: " + summaryWeight + " кг");
        System.out.println("Разница в весе боксеров: " + weightDiffer + " кг");
        System.out.println("Task2 done!\n");

        // задача 3
        int bananasAmount = 5, bananasWeight = 80;
        int milkAmount = 2, milkWeight = 105;
        int iceCreamAmount = 2, iceCreamWeight = 100;
        int eggsAmount = 4, eggsWeight = 70;
        float totalBreakfastWeightKg = ((bananasAmount * bananasWeight + milkAmount * milkWeight + iceCreamAmount * iceCreamWeight + eggsAmount * eggsWeight) / 1000f);

        System.out.println("Итоговый вес завтрака: " + totalBreakfastWeightKg + " кг");
        System.out.println("Task3 done!\n");

        // задача 4
        byte neededWeightLoss = 7;
        int minLoss = 250;
        int maxLoss = 500;
        int minDays = neededWeightLoss * 1000 / minLoss;
        int maxDays = neededWeightLoss * 1000 / maxLoss;
        float medianDaysNeeded = (minDays + maxDays) / 2f;

        System.out.println("Для похудения потребуется минимум " + minDays + " дней и максимум " + maxDays + " дней");
        System.out.println("В среднем же потребуется " + medianDaysNeeded + " дней");
        System.out.println("Task4 done!\n");

        // задача 5
        int salaryIndexationPercent = 10;
        int calculationPeriod = 12;

        int salaryMasha = 67_760;
        //сделал float по той причине, что другой процент (например 11) может повлечь за собой эту необходимость
        float increasedSalaryMasha = salaryMasha + (salaryMasha / 100f * salaryIndexationPercent);
        float periodIncreaseMasha = (increasedSalaryMasha - salaryMasha) * calculationPeriod;

        int salaryDenis = 83_690;
        float increasedSalaryDenis = salaryDenis + (salaryDenis / 100f * salaryIndexationPercent);
        float periodIncreaseDenis = (increasedSalaryDenis - salaryDenis) * calculationPeriod;

        int salaryKristina = 76_230;
        float increasedSalaryKristina = salaryKristina + (salaryKristina / 100f * salaryIndexationPercent);
        float periodIncreaseKristina = (increasedSalaryKristina - salaryKristina) * calculationPeriod;

        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + periodIncreaseMasha + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + periodIncreaseDenis + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + periodIncreaseKristina + " рублей");
        System.out.println("Общий ФОТ в годовом исчислении увеличится на " + (periodIncreaseMasha + periodIncreaseDenis + periodIncreaseKristina) + " рублей");
        System.out.println("Task 5 done!\n");

        // задача 6
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        result *= -1;

        System.out.println(result);
        System.out.println("Task 6 done!\n");

        // задача 7
        a = 5;
        b = 7;
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
        System.out.println("Task 7 done!\n");

        // задача 8
        a = 798;
        b = (a % 100);
        b /= 10;
        System.out.println(b);
        System.out.println("Task 8 done!\n");
    }
}
