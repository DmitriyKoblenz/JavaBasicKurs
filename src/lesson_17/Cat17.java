package lesson_17;

public class Cat17 {

    public String name;
    public int age;
    public int weight;


    public Cat17(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat17() {
    }

    public void sayMeow() {
        System.out.println("Мяу!" + name);
    }

    public String toString() {
        return "Cat " + name + ", age " + age + ", weigth " + weight;
    }
}
