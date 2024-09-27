package homework_3;

public class Task4 {
    public static void main(String[] args) {

        int t1 = 20;
        int t2 = 18;
        int t3 = 22;
        int t4 = 17;
        int t5 = 23;
        int t6 = 21;
        int t7 = 20;

        int days = 7;

        int sumTemp = t1 + t2 + t3 + t4 + t5 + t6 + t7;
        System.out.println("sumTemp: " + sumTemp);

        double averageTemp =  sumTemp / (double) days;

        System.out.println("averageTemp: " + averageTemp);

    }
}
