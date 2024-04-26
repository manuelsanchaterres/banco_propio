package domain.banco.cuentas;

public class CuentaJoven extends Cuenta{

    @Override
    public String toString() {
        return "CuentaJoven{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldoCuenta=" + saldoCuenta +
                ", contadorCuentas=" + contadorCuentas +
                '}';
    }

    public CuentaJoven (String numeroCuenta, double saldoCuenta) {

        super (numeroCuenta, saldoCuenta);
        setContadorCuentas(getContadorCuentas()+1);
    }

    public CuentaJoven () {
        super ();
    }

    @Override
    public void pagarInteres() {
        saldoCuenta *= 1.05;
    }
}
