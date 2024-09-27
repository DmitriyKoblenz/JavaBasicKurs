package homework_05;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        int indexMidlle = string.length() / 2 - 1;

        char first = string.charAt(indexMidlle);
        char second = string.charAt(indexMidlle + 1);

        System.out.println(first);
        System.out.println(second);

        String subStr = string.substring(indexMidlle, indexMidlle + 2);

        System.out.println(subStr);

    }
}
