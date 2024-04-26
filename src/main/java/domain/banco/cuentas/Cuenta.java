package domain.banco.cuentas;

abstract class Cuenta {

    // ATRIBUTOS VARIABLES
    String numeroCuenta = "";
    double saldoCuenta;
    int contadorCuentas;

    public Cuenta () {


    }

//    public Cuenta (String numeroCuenta, double saldoCuenta, int contadorCuentas) {
//
//        this.numeroCuenta = numeroCuenta;
//        this.saldoCuenta = saldoCuenta;
//        this.contadorCuentas = contadorCuentas;
//    }
    public Cuenta (String numeroCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    abstract void pagarInteres();

    public int getContadorCuentas() {
        return contadorCuentas;
    }

    public void setContadorCuentas(int contadorCuentas) {
        this.contadorCuentas = contadorCuentas;
    }

}
