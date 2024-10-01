package lesson_15;

public class MainCats {
    public static void main(String[] args) {
        Cat cat = new Cat(); // Создаем объект класса Кот

        cat.sayMeow(); // вызвали метод sayMeow
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Name: " + catName);

        System.out.println("Age: " + cat.age);

        System.out.println("=======");

        Cat cat1 = new Cat("Max");
        // Будет создан новый объект класса Cat
        // Имя (строка) которая была передана в конструкторе будет присвоено полю класса Name
        System.out.println("Color" + cat1.color);
        System.out.println("Name: " + cat1.name);
    }
}
