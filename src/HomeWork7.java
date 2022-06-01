public class HomeWork7 {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String midName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + lastName + " " + midName;
        System.out.println("Полное имя: " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        fullName = "Иванов Сёмен Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
