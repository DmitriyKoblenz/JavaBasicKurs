package lesson_05;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java";
        String string1 = new String("Hello!");

        System.out.println(string);

        int length = string.length();
        System.out.println("Length: " + length);

        System.out.println(string.toUpperCase());
    }
}
