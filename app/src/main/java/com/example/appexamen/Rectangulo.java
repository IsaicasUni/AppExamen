package com.example.appexamen;

public class Rectangulo {

    //ATRIBUTOS
    private double base;
    private double altura;

    //CONSTRUCTOR DE PARAMETROS
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //CONSTRUCTOR VACIO
    public Rectangulo(){
        this.base = 0.0;
        this.altura = 0.0;
    }

    //CONSTRUCTOR DE COPIA
    public Rectangulo(Rectangulo rectangulo){
        this.base = getBase();
        this.altura = getAltura();
    }

    //SET Y GET
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculoArea(){
        double area = 0.0;
        area = (base * altura);
        return area;
    }

    public double calculoPerimetro(){
        double perimetro = 0.0;
        perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }
}
