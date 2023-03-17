public class Rectangulo extends Figura{
    
    private double base;
    private double altura;
    
    public Rectangulo(double pbase, double paltura){
        base = pbase;
        altura = paltura;
    }
    
    public double calcularArea(){
        return base * altura;
    }

    public int numeroLados(){
        return 4;
    }

    // public int compareTo(Rectangulo rectPorComparar) {
    //     double areaPorComparar = rectPorComparar.calcularArea();
    //     double miArea = this.calcularArea();
        
    //     if (miArea == areaPorComparar){
    //         return 0;
    //     }
    //     else if (miArea > areaPorComparar){
    //         return 1;
    //     }
    //     else{
    //         return -1;
    //     }
    
    // }

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

//     @Override
//     public void compareTo(Figura o, Figura o2) {
//         double areaPorComparar = o2.calcularArea();
//         double miArea = o.calcularArea();
//         if (miArea == areaPorComparar){
//             System.out.println("Las areas son iguales");
//             if (o.numeroLados() > o2.numeroLados()){
//                 System.out.println("El primer rectangulo tiene mas lados");
//             }
//             else if (o.numeroLados() < o2.numeroLados()){
//                 System.out.println("El segundo rectangulo tiene mas lados");
//             }
//             else{
//                 System.out.println("Ambos rectangulos tienen el mismo numero de lados");
//             }
//         }
//         else if (miArea > areaPorComparar){
//             System.out.println("La area del primer rectangulo es mayor");
//         }
//         else{
//             System.out.println("La area del segundo rectangulo es mayor");
//         }
//     }
}