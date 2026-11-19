package encapsulamiento;



public class MainUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("carlos.dev", "clave1234");
        System.out.println("Usuario: " + u.getNombreUsuario());

        System.out.println("Login correcto? " + u.verificarPassword("clave1234"));

        System.out.println("\n--- Simulando 3 intentos fallidos ---");
        System.out.println("Intento 1: " + u.verificarPassword("mala1"));
        System.out.println("Intento 2: " + u.verificarPassword("mala2"));
        System.out.println("Intento 3: " + u.verificarPassword("mala3"));

        System.out.println("\n¿Bloqueada? " + u.isBloqueado());

        System.out.println("\n--- Probando con la clave correcta ---");
        System.out.println("Login correcto? " + u.verificarPassword("clave1234"));

        u.cambiarPassword("nuevaClave9");
    }
}
