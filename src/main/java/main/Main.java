package main;

import domain.banco.cuentas.CuentaJoven;

public class Main {

    public static void main(String[] args) {
// TODO, NECESITO VISUALIZAR LA SUMA DE CONTADOR DE CUENTAS TOTAL DESPUES DE CREAR CADA CUENTA
        CuentaJoven cuentaJoven = new CuentaJoven("ES6621000418401234567891",100);
        cuentaJoven.pagarInteres();
        System.out.println(cuentaJoven);
        CuentaJoven cuentaJoven2 = new CuentaJoven("ES6621000418401234567891",110);
        cuentaJoven2.pagarInteres();
        System.out.println(cuentaJoven2.getContadorCuentas());
    }
}
