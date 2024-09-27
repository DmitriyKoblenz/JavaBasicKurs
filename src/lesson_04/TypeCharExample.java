package lesson_04;

public class TypeCharExample {
    public static void main(String[] args) {

        char a = 'A';// Переменная будет хранить букву А латинского алфавита.
        char a1 = 65; // В консоли всё равно вывелось А, а не 65, потому что в десятичной системе счисление буква А под номером 65.
        char a2 = 0x41; // Присваиваем число в 16-тиричном фрмате, что соответсвует той же букве А.
        a2 = 0x0041; // Полная форма записи число в 16-тиричной системе счисления.

        System.out.println("a: "+ a);
        System.out.println("a1: " + a1);
        System.out.println();
    }
}
