package f11.capitulo10;

class Teste {

    public static void main(String[] args) {
        AreaCalculavel retangulo = new Retangulo(3, 2);
        System.out.println(retangulo.calculaArea());
        
        AreaCalculavel quadrado = new Quadrado(2);
        System.out.println(quadrado.calculaArea());
    }
}
