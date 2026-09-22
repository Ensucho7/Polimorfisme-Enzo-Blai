public abstract class Shape {
    public abstract double area();
    public int compareTo(Shape f){
        return (int)(this.area()-f.area());
    }
}