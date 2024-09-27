package homework_07;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести четырехзначное число
        System.out.print("Введите четырехзначное число: ");
        String input = scanner.nextLine();

        // Проверяем, что введено ровно 4 символа и это число
        if (input.length() != 4 || !input.matches("\\d+")) { // Если длина строки не равна 4, то выводим ошибку.
            System.out.println("Ошибка: необходимо ввести четырехзначное число.");
        } else {
            // Преобразуем символы строки в цифры
            int firstDigit = Character.getNumericValue(input.charAt(0));
            int secondDigit = Character.getNumericValue(input.charAt(1));
            int thirdDigit = Character.getNumericValue(input.charAt(2));
            int fourthDigit = Character.getNumericValue(input.charAt(3));

            // Вычисляем сумму первых двух и последних двух цифр
            int firstSum = firstDigit + secondDigit;
            int secondSum = thirdDigit + fourthDigit;

            // Проверяем, является ли число "счастливым билетом"
            if (firstSum == secondSum) {
                System.out.println("Число является счастливым билетом!");
            } else {
                System.out.println("Число НЕ является счастливым билетом.");
            }
        }

        // Закрываем сканер
        scanner.close();
    }
}
