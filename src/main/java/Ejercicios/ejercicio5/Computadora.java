package Ejercicios.ejercicio5;

import java.util.ArrayList;

public class Computadora {
    private IStateComputadora state;
    private CPU cpu;
    private RAM ram;
    private ArrayList<String> programasAbiertos;

    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public ArrayList<String> getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(ArrayList<String> programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }
}
