public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(4.0, 5.0);
        Shape circle = new Circle(3.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(5.0);

        System.out.printf("%s -> Área: %.2f%n", triangle.getClass().getSimpleName(), triangle.area());
        System.out.printf("%s -> Área: %.2f%n", circle.getClass().getSimpleName(), circle.area());
        System.out.printf("%s -> Área: %.2f%n", rectangle.getClass().getSimpleName(), rectangle.area());
        System.out.printf("%s -> Área: %.2f%n", square.getClass().getSimpleName(), square.area());

        System.out.println("\n--- Comparaciones de área ---");
        compararFiguras(square, rectangle);
        compararFiguras(triangle, circle);
    }

    private static void compararFiguras(Shape a, Shape b) {
        double resultado = a.compareTo(b);
        String nombreA = a.getClass().getSimpleName();
        String nombreB = b.getClass().getSimpleName();

        if (resultado > 0) {
            System.out.println(nombreA + " es mayor que " + nombreB);
        } else if (resultado < 0) {
            System.out.println(nombreA + " es menor que " + nombreB);
        } else {
            System.out.println(nombreA + " tiene la misma área que " + nombreB);
        }
    }
}