package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задачу:");
        System.out.println("1 - Работа с числами");
        System.out.println("2 - Сравнение строк");
        System.out.println("3 - Четные числа");

        int choice = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        switch (choice) {
            case 1:
                Operations.run();
                break;
            case 2:
                StringComparison.run();
                break;
            case 3:
                Even.run();
                break;
            default:
                System.out.println("Неверный выбор");
        }

        scanner.close();
    }
}