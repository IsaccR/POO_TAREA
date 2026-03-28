package Encapsulacion;

public class Cuenta {
	
	String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("No hay saldo suficiente");
        }
    }

    public String toString() {
        return "Titular: " + titular + " Saldo: " + saldo;
    }

}
