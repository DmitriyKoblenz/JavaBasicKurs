package homework_11;
// Дмитрий Пушкарь; 51.1; 24.09.2024
public class Task1 {
    public static int SumArray(int[] array) {
        int summa = 0;
        for (int i = 0; i< array.length; i++) {
            summa = summa + array[i];
        }
        return summa;
    }

    public static void main(String[] args) {
        int[] elemente = {6, 6, 6, 6, 6, 6};
        int result = SumArray(elemente);
        System.out.println(result);
    }

}
