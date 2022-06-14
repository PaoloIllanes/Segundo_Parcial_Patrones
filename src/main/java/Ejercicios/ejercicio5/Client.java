package Ejercicios.ejercicio5;

import java.util.ArrayList;

public class Client {
    public static void main(String[]args){

        CPU cpu= new CPU();
        RAM ram = new RAM();
        ArrayList<String>programas= new ArrayList<>();

        IStateComputadora apagado = new StateApagado();
        IStateComputadora encendido= new StateEncendido();
        IStateComputadora reiniciar = new StateReiniciar();

        Computadora computadora = new Computadora();
        computadora.setCpu(cpu);
        computadora.setProgramasAbiertos(programas);
        computadora.setRam(ram);

        computadora.setState(apagado);
        computadora.request();

        computadora.setState(reiniciar);
        computadora.request();

        computadora.setState(encendido);
        computadora.request();
    }
}
