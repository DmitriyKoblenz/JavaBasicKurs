package homework_06;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(51); // будет генерировать число от 0 до 51
        int b = random.nextInt(101);
        b = random.nextInt(51) -20; // от сгенерированного числа будет отнято -20 едениц

        int rand = random.nextInt(100) +1;
        rand = random.nextInt(); // во всём диапозоне типа int (очень большие цифры будет генерировать)

        // ----------------------------------

        boolean check = a == b; // сравнить а равно ли б
        System.out.println(a + "a == b: " + b + "->" + check);

        check = a != b;
        System.out.println("a != b: " + check);

        check = a > b;
        System.out.println("a > b:" + check);

        check = a < b;
        System.out.println("a < b: " + check);


    }
}
