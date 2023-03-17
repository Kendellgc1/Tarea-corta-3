public class Circulo extends Figura{
    private double radio;
    private double pi = 3.1416;
    
    public Circulo(double pradio){
        radio = pradio;
    }
    
    public double calcularArea(){
        return pi * radio * radio;
    }

    public int numeroLados(){
        return 0;
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
	// 	// TODO Auto-generated method stub
	// 	throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
	// }
}
