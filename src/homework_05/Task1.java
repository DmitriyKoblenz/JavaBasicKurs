package homework_05;

import java.util.Scanner;

// Author: Dmitriy Pushkar
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        int length = name.length();
        System.out.println("Количество символов имени: " + length);

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(length - 1);

        System.out.println("Первый символ имени: " + firstChar + ", его десятичный код: " + (int) firstChar);
        System.out.println("Последний символ имени: " + lastChar + ", его десятичный код: " + (int) lastChar);


    }
}
