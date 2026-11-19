package Herencia;

// ===== Clase padre =====
class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void describir() {
        System.out.println(marca + " " + modelo + " - $" + String.format("%,.0f", precio));
    }
}

// ===== Clase hija Carro =====
class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.numeroPuertas = puertas;
    }

    @Override
    public void describir() {
        super.describir(); // Reutiliza el método del padre
        System.out.println("Tipo: Carro - " + numeroPuertas + " puertas");
    }
}

// ===== Clase hija Moto =====
class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String marca, String modelo, double precio, int cilindraje) {
        super(marca, modelo, precio);
        this.cilindraje = cilindraje;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Moto - " + cilindraje + " cc");
    }
}

// ===== Clase hija Camioneta (reto) =====
class Camioneta extends Vehiculo {
    private double capacidadCarga; // en kg

    public Camioneta(String marca, String modelo, double precio, double capacidadCarga) {
        super(marca, modelo, precio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Camioneta - " + capacidadCarga + " kg de carga");
    }
}
