package Herencia;

// ===== Clase padre =====
class Animal {
    protected String nombre;
    protected int edad;
    protected String especie;

    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }

    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido.");
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", un " + especie +
                " de " + edad + " años.");
    }
}

// ===== Clase hija Perro =====
class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad, "Perro");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }

    public void perseguirCola() {
        System.out.println(nombre + " persigue su cola.");
    }
}

// ===== Clase hija Gato =====
class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad, "Gato");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau!");
    }

    public void ronronear() {
        System.out.println(nombre + " ronronea felizmente.");
    }
}

// ===== Clase hija Pajaro =====
class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad, "Pájaro");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Pio pio!");
    }

    public void volar() {
        System.out.println(nombre + " está volando por el cielo.");
    }
}

