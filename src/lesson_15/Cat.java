package lesson_15;

public class Cat {
    public String name;
    public String color;
    public int age;

    // Конструктор класса
    // Специальный тип метода.
    // Основная задача - установить начальное значение свойств объекта
    // ----
    /*
    1. Имя конструктора совпадает с именем класса
    2. Конструктор не имеет возвращаемого типа
    3. Конструктор вызывается автоматически при создании объекта
     */
    // Есть перегрузка кнструкторов

    public Cat(String cateName) {
        name = cateName;
    }

    public Cat () {

    }

    public Cat (String catName, String color) {
        name = catName;
        color = color;
    }

    public void sleep() {
        System.out.println("Я сплю!");
    }

    public void run() {
        System.out.println("Я бугу");
    }

    public void sayMeow() {
        System.out.println("Мяукаю");
    }

    public void  whoAmI() {
        System.out.println("");
    }
}
