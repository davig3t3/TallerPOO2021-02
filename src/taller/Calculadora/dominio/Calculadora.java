package taller.Calculadora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private int n1;
    private int n2;
    private List<Integer> calculadora;
    private  String marca;

    public Calculadora(String marca){
        this.marca = marca;
        this.calculadora = new ArrayList<Integer>();
    }

    public int sumar(int n1,int n2){

        if(n1==0)
            return n2;
        else{
            if(n2!=0)
                return sumar(n1,n2-1)+1;
            else
                return sumar(n1-1,n2)+1;
        }


        //return resultado;
    }

    public int restar(int n1, int n2){
        int resultado = 0;

        resultado = n1-n2;

        this.calculadora.add(resultado);


        return resultado;
    }

    public int mul(int n1, int n2){
        int resultado = 0;

        resultado = n1*n2;

        this.calculadora.add(resultado);


        return resultado;
    }

    public int div(int n1, int n2){
        int resultado = 0;

        resultado = n1/n2;

        this.calculadora.add(resultado);


        return resultado;
    }


    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }


    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

}
