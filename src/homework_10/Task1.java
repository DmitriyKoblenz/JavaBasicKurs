package homework_10;
//Дмитрий Пушкарь; группа 52.1; 23.09.2024
public class Task1 {

    public static void copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            if (i < array.length) {
                newArray[i] = array[i]; // копируем(присваиваем) из старого в новый массив
            } else {
                newArray[i] = 0; // если элементов не хватает бл, заполняем нулями
            }
        }

        System.out.print("Новый массив: {");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i != newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        int[] array1 = {0, 1, 2, 3, 4, 5, 6};
        copyOfArray(array1, 3); // вывод в консоль: {0, 1, 2}

        int[] array2 = {0, 1, 2};
        copyOfArray(array2, 5); // вывод: {0, 1, 2, 0, 0}
    }
}
