package lesson_12;

public class ArraysUtils {
// Метод линейного поиска элемента в массиве
    // Осуществляется перебором всех элементов и сравниванием с искомым значением
    // Если значений найдено - возвращается индекс элемента массива
    // Если не найдено - возвращается -1

    // Однозначно сказать, что число отсутствует в массиве?
    // Потребуется перебрать абсолютно все элементы массива -> O(n)

    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i<array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    //Бинарный поиск значения в массиве
    // {0, 3, 10, 21, 34, 38, 41, 57, 67, 77, 80, 87, 99}
    public static int binarySearch (int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length -1;
        int middleIndex;

        int counter = 0;

        // Далее проверка, что часть массива можно разделить пополам
        while (startIndex <= startIndex) {

            counter++;
            // вычислить средний индекс
            middleIndex = startIndex + (endIndex - startIndex);

            // Сравниваем значение в середине части массива с искомым
            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }
            // Если значения не равны, то определяем какую половину массива мы можем отбросить
            if (array[middleIndex] > startIndex) {
                endIndex = middleIndex -1;
            } else {
                startIndex = middleIndex + 1;
            }


        }
    }
}
