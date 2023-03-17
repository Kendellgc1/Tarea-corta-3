public class main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(2, 3);
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(2, 3);
        circulo.compareTo(rectangulo);
        triangulo.compareTo(circulo);
        rectangulo.compareTo(triangulo);
    }    
}
