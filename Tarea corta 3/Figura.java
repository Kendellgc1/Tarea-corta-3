public abstract class Figura implements Comparable<Figura>{

    public abstract double calcularArea();

    public abstract int numeroLados();

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



}