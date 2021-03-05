package org.reserv;

public class Calculadora {

    //Dependencia
    CalculadoraGoogleCloud calcCloud;

    public double sumar(double a, double b) {
        return a+b;
    }

    public double restar(double a, double b) {
        return a-b;
    }

    public double sumarEnCloud(double a, double b) {
        return calcCloud.sumar(a,b);
    }
}
