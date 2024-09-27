package lesson_07;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 7;

        if (x==5) {
            System.out.println("if: x = 5");
        } else if (x==7) {
            System.out.println("if else: x = 7");
        } else {
            System.out.println("else: etwas anderes");
        }

        switch (x) {
            case 5:
                System.out.println("X = 5");
                break;
            case 7:
                System.out.println("X = 7");
                break;
            default:
                System.out.println("Etwas anderes");
                break;
        }
    }
}
