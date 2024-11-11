package Base;

public class Cuenta {
    Cliente titular;
    String numero;
    double saldo;
    String tipo;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Constructor
    public Cuenta (String numero, String tipo, double saldo, Cliente titular){
        this.titular = titular;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    // Método para consignar dinero
    public void consignar(double cantidad) {
        saldo += cantidad;
    }

    // Método para retirar dinero
    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public double consultarSaldo(){
        return this.saldo;
    }
}
