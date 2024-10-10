package homework_20;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.name = "Прямоугольник";
        rectangle.setDimensions(5, 10);
        rectangle.displayInfo();
        rectangle.calculateArea();

        Circle circle = new Circle();
        circle.name = "Круг";
        circle.setRadius(7);
        circle.displayInfo();
        circle.calculateArea();
    }
}
