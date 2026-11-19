package Herencia;


    // ===== Clase padre =====
    class Empleado {
        protected String nombre;
        protected String documento;
        protected double salarioBase;

        public Empleado(String nombre, String documento, double salarioBase) {
            this.nombre = nombre;
            this.documento = documento;
            this.salarioBase = salarioBase;
        }

        public double calcularSalario() {
            return salarioBase;
        }

        public void mostrarInfo() {
            System.out.println("Empleado: " + nombre);
            System.out.println("Documento: " + documento);
            System.out.println("Salario a pagar: $" + calcularSalario());
        }
    }

    // ===== Clase hija Vendedor =====
    class Vendedor extends Empleado {
        private double comision;

        public Vendedor(String nombre, String documento,
                        double salarioBase, double comision) {
            super(nombre, documento, salarioBase);
            this.comision = comision;
        }

        @Override
        public double calcularSalario() {
            return salarioBase + comision;
        }
    }

    // ===== Clase hija Gerente =====
    class Gerente extends Empleado {
        private double bonificacion;

        public Gerente(String nombre, String documento,
                       double salarioBase, double bonificacion) {
            super(nombre, documento, salarioBase);
            this.bonificacion = bonificacion;
        }

        @Override
        public double calcularSalario() {
            return salarioBase + bonificacion;
        }
    }

    // ===== Clase hija AprendizSena (reto) =====
    class AprendizSena extends Empleado {
        private static final double PORCENTAJE_SOSTENIMIENTO = 0.50;

        public AprendizSena(String nombre, String documento, double salarioBase) {
            super(nombre, documento, salarioBase);
        }

        @Override
        public double calcularSalario() {
            return salarioBase * PORCENTAJE_SOSTENIMIENTO;
        }
    }

