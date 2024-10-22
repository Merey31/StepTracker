import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            switch (command) {
                case (1) -> System.out.println("non existent");
                case (2) -> System.out.println("non existent");
                case (3) -> System.out.println("non existent");
                case (4) -> {
                    System.out.println("Вы вышли.");
                    return;
                }
                default -> System.out.println("wrong number");
            }
        }
    }

   //self-explanatory
    static void printMenu(){
        System.out.println("""
                1 - Ввести количество шагов за день
                2 - Изменить цель по количеству шагов
                3 - Напечатать статистику за месяц
                4 - Выход""");
    }
}