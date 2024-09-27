package lesson_07;

import java.util.Random;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        int y = 125;
        y = 15;

        if (y > 11) {
            System.out.println("Hallo alle!");
            System.out.println("Bei uns gibt's " + y);
        } else {
            System.out.println("Wir haben 0, weil " + y);
        }

        System.out.println("Продолжение программы");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 oder 10:");

        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Спасибо за 1.");
        } else if (number == 10) {
            System.out.println("Sie haben die 10 eingegeben!");
        } else {
            System.out.println("Sie haben falsche Nummer eingegeben!");
        }

        // Нахождение минимума из нескольких чисел
        Random random = new Random();
        int A = random.nextInt (50);
        int B = random.nextInt(50);;
        int C = random.nextInt (50);

        System.out.println(A + "|" + B+ "|" + C);
        int min = A;
        if (B < min) min = B;
        if (C < min) min = C;
        System.out.println("Min: " + min);
    }
}
