package Herencia;

public class MainEmpresa {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Ana Lopez", "1234", 1500000, 350000);
        Gerente g = new Gerente("Pedro Ruiz", "5678", 3000000, 800000);
        AprendizSena a = new AprendizSena("Gabriel Vivas", "9012", 1500000);

        v.mostrarInfo();
        System.out.println("---");
        g.mostrarInfo();
        System.out.println("---");
        a.mostrarInfo();

        System.out.println("\n=== Nómina completa (polimorfismo) ===");
        Empleado[] nomina = { v, g, a };
        double total = 0;
        for (Empleado e : nomina) {
            total += e.calcularSalario();
        }
        System.out.println("Total nómina: $" + total);
    }
}
