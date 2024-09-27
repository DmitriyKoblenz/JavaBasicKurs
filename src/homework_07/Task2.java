package homework_07;
/**
 * Дмитрий Пушкарь
 * Группа 52.1
 * 18.09.2024
 */
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);

        System.out.println(num1 + ", " + num2 + ", " + num3);
        int max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;

        System.out.println("Max: " + max);

    }
}
