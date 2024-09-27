package homework_08;
/**
 * Дмитрий Пушкарь
 * Группа 52.1
 * 19.09.2024
 */
public class Task1 {
    public static void main(String[] args) {
        long a = 1;
        int i = 1;
        while (i <= 15) {
            a = a * i;
            i++;
        }
        System.out.println("Произведение всех чисел: " + a);
    }
}
