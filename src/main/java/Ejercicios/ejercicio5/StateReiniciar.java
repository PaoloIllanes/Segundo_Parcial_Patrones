package Ejercicios.ejercicio5;

public class StateReiniciar implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("Reinciando");
        System.out.println("Cerrando programas");

    }
}
