package Herencia;
class PersonalIPS {
    protected String documento;
    protected String nombre;
    protected double salarioBase;
    protected int asistencias;

    public PersonalIPS(String documento, String nombre, double salarioBase) {
        this.documento = documento;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.asistencias = 0;
    }

    // Igual para todos: NO se sobrescribe
    public void registrarAsistencia() {
        asistencias++;
        System.out.println(nombre + " registró asistencia. Total: " + asistencias);
    }

    // Se sobrescribe en cada hija
    public double calcularSalarioMensual() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Cargo: " + getClass().getSimpleName());
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Asistencias registradas: " + asistencias);
        System.out.println("Salario mensual: $" + String.format("%,.0f", calcularSalarioMensual()));
    }
}

// ===== Clase hija Medico =====
class Medico extends PersonalIPS {
    private static final double PAGO_POR_CONSULTA = 500000;

    private String especialidad;
    private int consultasDelMes;

    public Medico(String documento, String nombre, double salarioBase,
                  String especialidad, int consultasDelMes) {
        super(documento, nombre, salarioBase);
        this.especialidad = especialidad;
        this.consultasDelMes = Math.max(consultasDelMes, 0);
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase + (consultasDelMes * PAGO_POR_CONSULTA);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Consultas del mes: " + consultasDelMes);
    }
}

// ===== Clase hija Enfermero =====
class Enfermero extends PersonalIPS {
    private static final double RECARGO_NOCTURNO = 200000;

    private String turno; // mañana, tarde, noche

    public Enfermero(String documento, String nombre, double salarioBase, String turno) {
        super(documento, nombre, salarioBase);
        setTurno(turno);
    }

    public void setTurno(String turno) {
        if (turno != null && (turno.equalsIgnoreCase("mañana")
                || turno.equalsIgnoreCase("tarde")
                || turno.equalsIgnoreCase("noche"))) {
            this.turno = turno.toLowerCase();
        } else {
            System.out.println("Turno inválido: " + turno + ". Se asigna 'mañana'.");
            this.turno = "mañana";
        }
    }

    @Override
    public double calcularSalarioMensual() {
        if (turno.equals("noche")) {
            return salarioBase + RECARGO_NOCTURNO;
        }
        return salarioBase;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Turno: " + turno);
    }
}

// ===== Clase hija Administrativo =====
class Administrativo extends PersonalIPS {
    private String area;

    public Administrativo(String documento, String nombre, double salarioBase, String area) {
        super(documento, nombre, salarioBase);
        this.area = area;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase; // Solo salario base
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Área: " + area);
    }
}
