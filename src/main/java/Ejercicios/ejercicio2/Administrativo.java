package Ejercicios.ejercicio2;

public class Administrativo extends Colleague {
    private String name;
    private int id;
    private String position;

    public Administrativo(ICanalDeComunicacion mediator, String name, int id, String position) {
        super(mediator);
        this.name = name;
        this.id = id;
        this.position = position;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - ****Message Received**** -- " + position + ": " + name
                + ", id " + id + " \n >> " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
