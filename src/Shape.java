public abstract class Shape {
    public abstract double area();
    public double compareTo(Shape f){
        return Double.compare(this.area(),f.area());
    }
}