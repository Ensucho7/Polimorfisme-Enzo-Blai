public abstract class Shape {
    public abstract double area();
    public double compareTo(Shape f){
        return (double)(this.area()-f.area());
    }
}