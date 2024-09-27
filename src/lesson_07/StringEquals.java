package lesson_07;

public class StringEquals {
    public static void main(String[] args) {
        // Ссылочный тип памяти
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.println(str1 + "|" + str2 + "|" + str3 + "|" + str4);

        boolean b1 = (str1 == str2);
        System.out.println("str1 == str2: " + b1);
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str4: " + (str1 == str4));

        // String pool

        // Важно!!!
        // Для сравнения строк(String's) по их значению, мы ДОЛЖНЫ исользовать метод .equals(иквалс)
        boolean b2 = str1.equals(str2); // Зравнение по значению строк (не по ссылкам) .equals(*)
        System.out.println("str1.equals(str2) -> " + b2); // true
        System.out.println("str1.equals(str4) -> " + str1.equals(str4)); // true
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));
        System.out.println(str1 + ".equalsIgnoreCase(" + str3 + ") -> " + str1.equalsIgnoreCase(str3)); // Сравнение по значению

    }
}
