package Ejercicios.ejercicio1;

public class DocVersion {
    private GoogleDoc state;

    public DocVersion(GoogleDoc stateSaved){
        state=stateSaved;

    }
    public GoogleDoc getState(){
        return state;
    }
}
