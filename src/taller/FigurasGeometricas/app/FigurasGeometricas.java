package taller.FigurasGeometricas.app;

import taller.FigurasGeometricas.dominio.Circulo;
import taller.FigurasGeometricas.dominio.Cuadrado;
import taller.FigurasGeometricas.dominio.Figura;
import taller.FigurasGeometricas.dominio.TrianguloRectangulo;

import java.util.ArrayList;
import java.util.List;

public class FigurasGeometricas {
    public static void main(String[] args) {

        List<Figura> figuras = new ArrayList<>();

        Figura figura = new TrianguloRectangulo(50, 87);
        Circulo circulo = new Circulo(80);
        Cuadrado cuadrado = new Cuadrado(5, 6);

        figuras.add(figura);
        figuras.add(circulo);
        figuras.add(cuadrado);

        figuras.forEach(f -> {
            System.out.println("Se calculará el área y perímetro de " + f);
            System.out.println("Área " + f.calcularArea());
            System.out.println("Perímetro " + f.calcularPerimetro() + "\n");
        });

    }
}
