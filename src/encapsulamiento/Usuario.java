package encapsulamiento;

public class Usuario {
    private String nombreUsuario;
    private String password;
    private int intentosFallidos = 0;
    private boolean bloqueado = false;

    private static final int MAX_INTENTOS = 3;

    public Usuario(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        if (esPasswordValida(password)) {
            this.password = password;
        } else {
            System.out.println("Contraseña inicial inválida.");
        }
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void cambiarPassword(String nuevaPassword) {
        if (bloqueado) {
            System.out.println("Cuenta bloqueada: no se puede cambiar la contraseña.");
            return;
        }
        if (esPasswordValida(nuevaPassword)) {
            this.password = nuevaPassword;
            System.out.println("Contraseña cambiada correctamente.");
        } else {
            System.out.println("Contraseña inválida: mínimo 8 caracteres, con letras y números.");
        }
    }

    public boolean verificarPassword(String intento) {
        if (bloqueado) {
            System.out.println("Cuenta bloqueada. Acceso denegado.");
            return false;
        }

        if (password != null && password.equals(intento)) {
            intentosFallidos = 0;
            return true;
        }

        intentosFallidos++;
        System.out.println("Intento fallido " + intentosFallidos + " de " + MAX_INTENTOS);

        if (intentosFallidos >= MAX_INTENTOS) {
            bloqueado = true;
            System.out.println("Se alcanzó el máximo de intentos. Cuenta BLOQUEADA.");
        }
        return false;
    }

    private boolean esPasswordValida(String p) {
        return p != null
                && p.length() >= 8
                && p.matches(".*[a-zA-Z].*")
                && p.matches(".*\\d.*");
    }
}