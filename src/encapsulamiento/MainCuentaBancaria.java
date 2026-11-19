package encapsulamiento;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        //Main

        System.out.println("Aplication Running");

    CuentaBancaria cuenta1 = new CuentaBancaria("CUENTA-875698","petrohpt",100000000);
    System.out.println("Titular:"+cuenta1.getTitular());
    System.out.println("saldo inicial: $"+ cuenta1.getSaldo());
}

}
