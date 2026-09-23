public class Rectangle extends Shape {

    private double height;
    private double base;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;

    }

    @Override
    public double area() {
        return  (this.base*this.height);
    }
}
