package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

        String info() {
            return "I'm dog" + name + "./nMy weight is" + weight;
        }

        void eat () {
            System.out.println("Я ем");
            weight++;
        }

        void run () {
        if (weight < 3) {
            System.out.println("Нет, мне надо поесть");
            System.out.println("Мой вес сейчас: " + weight);

            eat();
        }
            System.out.println("Я бугу");
        }


}

