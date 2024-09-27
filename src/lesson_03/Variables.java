package lesson_03;

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable; // Объявление (деклараця) переменной типа int

        myFirstVariable = 1; // Первое присвоение значения в переменную называется Инициализация

        int mySecondVariable = 25; // Объявление и инициализация в одной строке

        System.out.println(myFirstVariable);

        mySecondVariable = 50;

        System.out.println(mySecondVariable);

        byte byteVariable = 125;
        byteVariable = 7;
        System.out.println("Значение ByteVariable: " + byteVariable);

        long longInt = 210_000_000; // "_" Этот знак ни на что не влияет, только для удобства
        longInt = 777000000;
        System.out.println(longInt);

        longInt = 777_000_000_777L; // Буквой L мы указали компилятору что это реально длинное число, а не просто формата Integer

        double doubleOne = 1.5421; // именно точка нужна в этом формате, не запятая
        System.out.println(doubleOne);
    }
}
