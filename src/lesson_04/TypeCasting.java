package lesson_04;

public class TypeCasting {
    public static void main(String[] args) {

        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // неявное преобразование типа byte в тип int.
        System.out.println("intVal: " + intVal);

        double doubleValue = intVal; // неявное преобразование int to double, потому что дабл больше.

        double doubleVal = 42.9;
        int int1 = (int) doubleVal; // Явное преобразование из double to int.

        System.out.println(doubleVal);
        System.out.println(int1);

        short shortVal = (short) int1;
        System.out.println(shortVal);

        int x = 20;
        int y = 7;

        double result;

        result = x / y;
        System.out.println(result);

        result = x / 7.0;
        System.out.println("Result: " + result);

        result = (float) x / y; // будет произведено обычное делние (на целое число)
        System.out.println("Result float cast: " + result);
    }
}
