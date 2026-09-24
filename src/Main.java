import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shape[] lista = new Shape[4]; //Array<Shape>();

        Shape triangle = new Triangle(4.0, 5.0);
        lista[0] = triangle;
        Shape circle = new Circle(3.0);
        lista[1] = circle;
        Shape rectangle = new Rectangle(4.0, 6.0);
        lista[2] = rectangle;
        Shape square = new Square(5.0);
        lista[3] = square;


        for (Shape s : lista){
            System.out.printf("%s -> Área: %.2f%n", triangle.getClass().getSimpleName(), s.area());
        }

        System.out.println("\n--- Comparaciones de área ---");
        compararFiguras(square, rectangle);
        compararFiguras(triangle, circle);

        System.out.println("\n--- Suma de áreas ---");

        System.out.println(sumarLista(lista));

        System.out.println("\n--- Lista original ---");
        for (Shape s : lista){
            System.out.printf("%s -> Área: %.2f%n", s.getClass().getSimpleName(), s.area());
        }

        System.out.println("\n--- Lista ordenada ---");
        ordenarLista(lista);
        for (Shape s : lista){
            System.out.printf("%s -> Área: %.2f%n", s.getClass().getSimpleName(), s.area());
        }



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
    private static double sumarLista(Shape[] lista){
        double resultado = 0;
        for (Shape s : lista){
            resultado += s.area();
        }
        return resultado;
    }

    private static void ordenarLista(Shape[] lista){
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (lista[j].compareTo(lista[j+1]) > 0) {
                    Shape temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }
        }
    }

}