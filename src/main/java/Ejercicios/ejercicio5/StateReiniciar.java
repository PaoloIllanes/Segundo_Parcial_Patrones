package Ejercicios.ejercicio5;

public class StateReiniciar implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("Reinciando");
        System.out.println("Cerrando programas");
        computadora.getProgramasAbiertos().clear();
        computadora.getCpu().setUsage(0);
        computadora.getRam().setUsage(0);
        System.out.println("Programas abiertos: "+computadora.getProgramasAbiertos().size());
        System.out.println("Uso de cpu: "+computadora.getCpu().getUsage()+"%");
        System.out.println("Uso de ram: "+computadora.getRam().getUsage()+"%");


    }
}
