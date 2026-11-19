package encapsulamiento;

public class MainAprendiz {
    public static void main(String[] args) {
        Aprendiz a = new Aprendiz("1090123456", "Laura Gomez");
        a.setEdad(19);
        a.setNotaFinal(4.0);
        a.setNotaFinal(7.0); // invalido - sera rechazado por la clase

        a.setCorreoInstitucional("correo.sin.arroba.com");   // invalido
        a.setCorreoInstitucional("lgomez@soy.sena.edu.co");  // valido

        System.out.println("Aprendiz: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nota final: " + a.getNotaFinal());
        System.out.println("Correo: " + a.getCorreoInstitucional());
        System.out.println("Aprobo? " + (a.aprobo() ? "Si" : "No"));
    }
}