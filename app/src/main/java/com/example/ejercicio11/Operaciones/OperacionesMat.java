package com.example.ejercicio11.Operaciones;

public class OperacionesMat {
    public int num1;
    public int num2;

    public OperacionesMat(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setValue1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double suma(){
        return  getNum1() + getNum2();
    }

    public double resta(){
        return getNum1() - getNum2();
    }

    public double division() { return (double) getNum1() / getNum2(); }

    public double multiplicacion(){
        return getNum1() * getNum2();
    }
}

