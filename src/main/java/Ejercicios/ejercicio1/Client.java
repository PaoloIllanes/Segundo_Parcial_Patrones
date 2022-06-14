package Ejercicios.ejercicio1;

public class Client {
    public static void main(String[] args) {
        EditorDoc editorDoc = new EditorDoc();
        Metodo comando = new Metodo();
        GoogleDoc doc;

        String txt = "Hola mundo";
        doc = new GoogleDoc(1, "guardado", txt);
        comando.setState(doc);
        editorDoc.saveDoc(1,comando.createMemento());


    }
}