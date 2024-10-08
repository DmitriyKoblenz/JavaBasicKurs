package lesson_17;

public class CatAPP {
    public static void main(String[] args) {

        Cat17 cat = new Cat17("Catty", 8, 5);
        cat.sayMeow();

        System.out.println(cat.toString());

        cat.age = -1000;

        cat.name = null;

        cat.weight = 1500;

        System.out.println(cat.toString());
    }
}
