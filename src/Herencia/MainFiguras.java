package Herencia;

public class MainFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Triangulo t = new Triangulo("Verde", 6, 4);

        System.out.println("=== Forma de la guía ===");
        System.out.println("Circulo " + c.getColor() + " - Area: " + c.calcularArea());
        System.out.println("Rectangulo " + r.getColor() + " - Area: " + r.calcularArea());
        System.out.println("Triangulo " + t.getColor() + " - Area: " + t.calcularArea());

        System.out.println("\n=== Reto extra: usando describir() ===");
        Figura[] figuras = { c, r, t };
        for (Figura f : figuras) {
            f.describir();
        }
    }
}
