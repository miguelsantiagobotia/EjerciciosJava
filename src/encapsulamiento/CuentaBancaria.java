package encapsulamiento;

public class CuentaBancaria {
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }




    private String numeroCuenta;
    private String titular;
    public double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    //Getters - solo lectura del exterior

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double cantidad){
        if(cantidad>0){
           this.saldo += cantidad;
           System.out.println("Deposito exitoso de $"+cantidad);
        }else {
            System.out.println("Error la cantidad debe ser positiva");
        }
    }
    public void retirar(double cantidad){
        if(cantidad<=0){
            System.out.println("Error: la cantidad debe ser positiva");
        }
        else if(cantidad>this.saldo){
            System.out.println("Error: saldo insuficiente");
        }


    }
}