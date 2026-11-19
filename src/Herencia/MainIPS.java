package Herencia;

public class MainIPS {
    public static void main(String[] args) {
        Medico med = new Medico("1090111222", "Laura Pérez", 4000000, "Pediatría", 20);
        Enfermero enf = new Enfermero("1090333444", "Jorge Rincón", 2000000, "noche");
        Administrativo adm = new Administrativo("1090555666", "Sandra Mora", 1800000, "facturación");

        System.out.println("=== Registro de asistencia ===");
        med.registrarAsistencia();
        med.registrarAsistencia();
        enf.registrarAsistencia();
        adm.registrarAsistencia();

        System.out.println("\n=== Información del personal ===");
        PersonalIPS[] personal = { med, enf, adm };
        double totalNomina = 0;

        for (PersonalIPS p : personal) {
            p.mostrarInfo();
            System.out.println("------------------------------");
            totalNomina += p.calcularSalarioMensual();
        }

        System.out.println("Total nómina IPS: $" + String.format("%,.0f", totalNomina));
    }
}
