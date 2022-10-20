public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1-1");
        System.out.println("ФИО сотрудника — " + task1());
        System.out.println();

        System.out.println("Задание 1-2");
        task2();
        System.out.println();

        System.out.println("Задание 1-3");
        task3();
        System.out.println();


    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String nameCheck = fullName.replace("ё", "е");
        System.out.println(nameCheck);
    }

    private static void task2() {
        String nameUp = task1().toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + nameUp);
    }

    public static String task1() {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        return fullName;
    }
}