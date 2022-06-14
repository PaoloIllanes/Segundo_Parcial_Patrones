package Ejercicios.ejercicio5;

public class StateApagado implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("Iniciando");
        computadora.getCpu().setUsage(5);
        computadora.getRam().setUsage(5);
        System.out.println("Programas abiertos: "+computadora.getProgramasAbiertos().size());
        System.out.println("Uso de cpu: "+computadora.getCpu().getUsage()+"%");
        System.out.println("Uso de ram: "+computadora.getRam().getUsage()+"%");


    }
}
