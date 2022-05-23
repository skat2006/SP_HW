/*
УСЛОВНЫЕ ОПЕРАТОРЫ
 */
public class HomeWork3 {
    public static void main(String[] args) {
        // задание 1
        int clientOS = 1; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ОС не распознана");
        }
        System.out.println("Task1 done!\n");

        // задание 2
        int clientDeviceYear = 2012;
        String outInfo = "Установите версию ";

        if (clientDeviceYear < 2015) {
            outInfo = "Установите облегченную версию ";
        }
        if (clientOS == 0) {
            outInfo += "приложения для iOS по ссылке";
        } else if (clientOS == 1) {
            outInfo += "приложения для Android по ссылке";
        } else {
            outInfo = "ОС не распознана";
        }

        System.out.println(outInfo);
        System.out.println("Task2 done!\n");

        // задание 3
        int year = 2200;
        int inclusion1 = 400, inclusion2 = 4, exclusion = 100;

        if (year % inclusion1 == 0 || (year % inclusion2 == 0 && year % exclusion != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Task3 done!\n");

        // задание 4
        int deliveryDistance = 95;
        int oneDayDelivery = 20;
        int deliveryIncreaseRange = 40;
        int deliveryDays = 1;

        if (deliveryDistance > oneDayDelivery) {
            deliveryDays += 1 + ((deliveryDistance - oneDayDelivery - 1) / deliveryIncreaseRange);
        }

        System.out.println("Потребуется дней на доставку: " + deliveryDays);
        System.out.println("Task4 done!\n");

        // задание 5
        int monthNumber = 12;
        String partOfTheYear;
        //вместо default тут можно вставить условие на выполнение switch-case:
        //if (monthNumber > 0 && monthNumber < 13) { switch-case }
        //но я не стал этого делать, default нормально отрабатывает

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                partOfTheYear = "Сезон - Зима";
                break;
            case 3:
            case 4:
            case 5:
                partOfTheYear = "Сезон - Весна";
                break;
            case 6:
            case 7:
            case 8:
                partOfTheYear = "Сезон - Лето";
                break;
            case 9:
            case 10:
            case 11:
                partOfTheYear = "Сезон - Осень";
                break;
            default:
                partOfTheYear = "Месяц задан не верно!";
                break;
        }
        System.out.println(partOfTheYear);
        System.out.println("Task5 done!");
    }
}
