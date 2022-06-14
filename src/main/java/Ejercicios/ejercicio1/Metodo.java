package Ejercicios.ejercicio1;

public class Metodo {
    private GoogleDoc state;

    public GoogleDoc getState() {
        return state;
    }

    public void setState(GoogleDoc state) {
        this.state = state;
    }

    public void restoreMemento(DocVersion docVersion){
        this.state=docVersion.getState();
        System.out.println("Recuperando estado...");
        this.state.showInfo();
        System.out.println("---------------------------------");

    }
    public DocVersion createMemento(){
        return  new DocVersion(this.state);
    }
}
