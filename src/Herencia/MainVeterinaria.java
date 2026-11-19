package Herencia;

public class MainVeterinaria {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", 3);
        Gato gato = new Gato("Michi", 2);
        Pajaro pajaro = new Pajaro("Piolín", 1);

        System.out.println("--- Perro ---");
        perro.presentarse();
        perro.comer();
        perro.hacerSonido();
        perro.perseguirCola();

        System.out.println("\n--- Gato ---");
        gato.presentarse();
        gato.dormir();
        gato.hacerSonido();
        gato.ronronear();

        System.out.println("\n--- Pájaro ---");
        pajaro.presentarse();
        pajaro.comer();
        pajaro.dormir();
        pajaro.hacerSonido();
        pajaro.volar();

        System.out.println("\n--- Polimorfismo ---");
        Animal[] animales = { perro, gato, pajaro };
        for (Animal a : animales) {
            a.presentarse();
            a.hacerSonido();
        }
    }
}
