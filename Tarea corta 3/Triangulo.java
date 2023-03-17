public class Triangulo extends Figura{
    private double base;
    private double altura;
    
    public Triangulo(double pbase, double paltura){
        base = pbase;
        altura = paltura;
    }
    
    public double calcularArea(){
        return base * altura / 2;
    }

    public int numeroLados(){
        return 3;
    }

	@Override
	public void compareTo(Figura o) {
        double areaPorComparar = o.calcularArea();
        double miArea = this.calcularArea();
        if (miArea == areaPorComparar){
            System.out.println("Las areas son iguales");
            if (o.numeroLados() > o.numeroLados()){
                System.out.println("La primera figura tiene mas lados");
            }
            else if (o.numeroLados() < o.numeroLados()){
                System.out.println("La segunda figura tiene mas lados");
            }
            else{
                System.out.println("Ambas figuras tienen el mismo numero de lados");
            }
        }
        else if (miArea > areaPorComparar){
            System.out.println("La area de la primera figura es mayor");
        }
        else{
            System.out.println("La area de la segunda figura es mayor");
        }
    }

    // @Override
    // public void compareTo(Figura o, Figura o2) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    // }
}
