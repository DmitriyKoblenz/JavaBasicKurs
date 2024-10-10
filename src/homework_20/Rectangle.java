package homework_20;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        double area = width * height;
        System.out.println("Площадь прямоугольника: " + area);
    }
}
