package homework_11;
// Дмитрий Пушкарь
public class Task2 {
    public static double del (int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) { // i - номер ячейки массива
            sum += array[i];
        }
        return sum/ array.length;
    }

    public static void main(String[] args) {
        int[] array = {5,5,5,10,10,10};
        double result = del(array);
        System.out.println(result);
    }
}
