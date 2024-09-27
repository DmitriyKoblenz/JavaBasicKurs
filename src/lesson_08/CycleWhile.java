package lesson_08;

public class CycleWhile {
    public static void main(String[] args) {
        int var1 = 100;
        while (var1 >= 90) {
            System.out.println(var1);
            var1--;
        }

        var1=1;
        int sum = 0;

        while (var1 <= 100) {
            sum += var1;
            var1++;
        }

        System.out.println(sum);

        var1 = 1;
        while (var1 <= 21) {
            if (var1 % 2 == 0) {
                System.out.println(var1);
            }
            var1++;
        }

        String str = "Hello!";
        var1 = 0;
        while (var1 <= str.length() -1) {
            System.out.println(str.charAt(var1++));
        }
    }
}
