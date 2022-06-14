package Ejercicios.ejercicio2;

public class Docente extends Colleague{
    private String name;
    private int ci;

    public Docente(ICanalDeComunicacion mediator, String name, int ci) {
        super(mediator);
        this.name = name;
        this.ci = ci;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("-- INFO - ****Message Received**** -- Docente: " + name
                + ", matrícula " + ci + " \n >> " + message);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
