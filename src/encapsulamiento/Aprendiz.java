package encapsulamiento;

public class Aprendiz {
    private String documento;
    private String nombre;
    private int edad;
    private double notaFinal;
    private String correoInstitucional;

    // Constructor
    public Aprendiz(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = 0;
        this.notaFinal = 0.0;
    }

    // Getters
    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    // Setters con validación
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Error: debe ingresar una edad valida");
        }
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0.0 && notaFinal <= 5.0) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Error: debe ingresar una nota valida entre 0.0 y 5.0");
        }
    }

    public void setCorreoInstitucional(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correoInstitucional = correo;
        } else {
            System.out.println("Error: el correo debe contener @");
        }
    }

    public boolean aprobo() {
        return notaFinal >= 3.5;
    }
}