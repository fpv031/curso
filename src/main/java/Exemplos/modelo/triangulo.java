package Exemplos.modelo;

public class triangulo {
    public double a;
    public double b;
    public double c;

    public double area() {double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public String verificadormaior (triangulo tri1, triangulo tri2  ){
        String resultado;
        if(tri1.area() > tri2.area()){
            resultado = "Larger area: X";
        }else {
            resultado = "Larger area: Y";
        }
        return resultado;
    }
}



