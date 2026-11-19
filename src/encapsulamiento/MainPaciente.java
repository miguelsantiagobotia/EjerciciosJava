package encapsulamiento;


    import java.util.Arrays;

    public class MainPaciente {
        public static void main(String[] args) {
            Paciente p = new Paciente("1090123456", "María Gómez", 35, "O+");
            System.out.println(p);

            System.out.println("\n--- Validaciones ---");
            p.setEdad(150);          // inválida
            p.setTipoSangre("C+");   // inválido
            System.out.println("Edad sigue en: " + p.getEdad());
            System.out.println("Tipo de sangre sigue en: " + p.getTipoSangre());

            System.out.println("\n--- Alergias ---");
            System.out.println("¿Tiene alergias? " + p.tieneAlergias());
            p.agregarAlergia("Penicilina");
            p.agregarAlergia("Mariscos");
            System.out.println("¿Tiene alergias? " + p.tieneAlergias());
            System.out.println("Alergias: " + Arrays.toString(p.getAlergias()));

            System.out.println("\n--- Diagnóstico ---");
            p.actualizarDiagnostico("clave-falsa", "Hipertensión");   // falla
            p.actualizarDiagnostico("MED-2026", "Hipertensión arterial grado 1");

            System.out.println("Consulta sin clave correcta: " + p.consultarDiagnostico("1234"));
            System.out.println("Consulta con clave médica: " + p.consultarDiagnostico("MED-2026"));

            // p.diagnostico;          // ❌ Error: es private
            // p.getDiagnostico();     // ❌ Error: no existe
        }
    }

