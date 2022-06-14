package Ejercicios.ejercicio2;

public class Estudiante extends Colleague{
    private String name;
    private int matricula;
    private boolean sendTeacher;
    private boolean sendAdmin;
    private boolean sendAll;

    public Estudiante(ICanalDeComunicacion mediator, String name, int matricula, boolean sendTeacher, boolean sendAdmin, boolean sendAll) {
        super(mediator);
        this.name = name;
        this.matricula = matricula;
        this.sendTeacher = sendTeacher;
        this.sendAdmin = sendAdmin;
        this.sendAll = sendAll;
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("-- INFO - ****Message Received**** -- Alumno: " + name
        + ", matrícula " + matricula + " \n >> " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isSendTeacher() {
        return sendTeacher;
    }

    public void setSendTeacher(boolean sendTeacher) {
        this.sendTeacher = sendTeacher;
    }

    public boolean isSendAdmin() {
        return sendAdmin;
    }

    public void setSendAdmin(boolean sendAdmin) {
        this.sendAdmin = sendAdmin;
    }

    public boolean isSendAll() {
        return sendAll;
    }

    public void setSendAll(boolean sendAll) {
        this.sendAll = sendAll;
    }
}
