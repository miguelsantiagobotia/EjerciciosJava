package encapsulamiento;

import java.util.Arrays;

public class Paciente {
    // Atributos privados (Ley 1581 de 2012: datos sensibles protegidos)
    private String documento;
    private String nombre;
    private int edad;
    private String tipoSangre;
    private String diagnostico;          // SIN getter público
    private String[] alergias;
    private int cantidadAlergias;

    // Constantes de la clase
    private static final String CLAVE_MEDICO = "MED-2026";
    private static final String[] TIPOS_SANGRE_VALIDOS =
            {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
    private static final int MAX_ALERGIAS = 10;

    public Paciente(String documento, String nombre, int edad, String tipoSangre) {
        this.documento = documento;
        this.nombre = nombre;
        setEdad(edad);
        setTipoSangre(tipoSangre);
        this.diagnostico = "Sin diagnóstico";
        this.alergias = new String[MAX_ALERGIAS];
        this.cantidadAlergias = 0;
    }

    // ---------- Getters de datos no sensibles ----------
    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTipoSangre() { return tipoSangre; }

    // ---------- Setters con validación ----------
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida (" + edad + "). Debe estar entre 0 y 120.");
        }
    }

    public void setTipoSangre(String tipoSangre) {
        if (esTipoSangreValido(tipoSangre)) {
            this.tipoSangre = tipoSangre.toUpperCase();
        } else {
            System.out.println("Tipo de sangre inválido: " + tipoSangre);
        }
    }

    // ---------- Diagnóstico (protegido con clave) ----------
    public String consultarDiagnostico(String claveMedico) {
        if (claveCorrecta(claveMedico)) {
            return diagnostico;
        }
        return "Acceso denegado: clave de médico incorrecta.";
    }

    public boolean actualizarDiagnostico(String claveMedico, String nuevoDiagnostico) {
        if (!claveCorrecta(claveMedico)) {
            System.out.println("Acceso denegado: no se puede actualizar el diagnóstico.");
            return false;
        }
        if (nuevoDiagnostico == null || nuevoDiagnostico.isBlank()) {
            System.out.println("El diagnóstico no puede estar vacío.");
            return false;
        }
        this.diagnostico = nuevoDiagnostico;
        System.out.println("Diagnóstico actualizado correctamente.");
        return true;
    }

    // ---------- Alergias ----------
    public void agregarAlergia(String alergia) {
        if (alergia == null || alergia.isBlank()) {
            System.out.println("La alergia no puede estar vacía.");
            return;
        }
        if (cantidadAlergias >= MAX_ALERGIAS) {
            System.out.println("No se pueden agregar más alergias (máximo " + MAX_ALERGIAS + ").");
            return;
        }
        alergias[cantidadAlergias] = alergia;
        cantidadAlergias++;
    }

    public boolean tieneAlergias() {
        return cantidadAlergias > 0;
    }

    // Devuelve una COPIA para que nadie modifique el arreglo original desde fuera
    public String[] getAlergias() {
        return Arrays.copyOf(alergias, cantidadAlergias);
    }

    // ---------- Métodos privados de apoyo ----------
    private boolean claveCorrecta(String clave) {
        return CLAVE_MEDICO.equals(clave);
    }

    private boolean esTipoSangreValido(String tipo) {
        if (tipo == null) return false;
        for (String t : TIPOS_SANGRE_VALIDOS) {
            if (t.equalsIgnoreCase(tipo)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        // El diagnóstico NO se muestra aquí
        return "Paciente{documento='" + documento + "', nombre='" + nombre +
                "', edad=" + edad + ", tipoSangre='" + tipoSangre +
                "', alergias=" + Arrays.toString(getAlergias()) + "}";
    }
}
