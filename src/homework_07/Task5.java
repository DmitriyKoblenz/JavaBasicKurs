package homework_07;
/**
 * Дмитрий Пушкарь
 * Группа 52.1
 * 18.09.2024
 */
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int note = random.nextInt(12);
        System.out.println(note);

        int restmin = 45;
        int note1 = 60;
        int note2 = 45;
        int note3 = 15;
        int note4 = -15;
        switch (note) {
            case 10:
            case 11:
            case 12:
                System.out.println("Молодец! Иди ещё " + (restmin + note1) + " минут смотри свои мультики!");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Красавчик! Иди ещё " + (restmin + note2) + " минут смотри свои мультики!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Иди ещё " + (restmin + note3) + " минут смотри свои мультики!");
                break;
            case 3:
                System.out.println("Тебе осталось всего "  + (restmin + note4) +  " минут");
            default:
                System.out.println("Сегодня уроки вместо телевизора сынок");
        }
    }
}
