package homework_10;

import java.util.ArrayList;
//Дмитрий Пушкарь(with GPT); группа 52.1; 23.09.2024
public class Task3 {
    // Метод для проверки, является ли число простым
    public static boolean number1(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] filterPrimes(int[] array) {
        ArrayList<Integer> primesList = new ArrayList<>();
        for (int number : array) {
            if (number1(number)) {
                primesList.add(number);
            }
        }
        int[] primesArray = new int[primesList.size()];
        for (int i = 0; i < primesList.size(); i++) {
            primesArray[i] = primesList.get(i);
        }
        return primesArray; // Возвращаем массив простых чисел
    }

    public static void main(String[] args) {
        int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] primes = filterPrimes(numbers);

        System.out.print("Простые числа: ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
