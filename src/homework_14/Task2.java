package homework_14;

public class Task2 {
    public static int sumOfEvenNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }
}
