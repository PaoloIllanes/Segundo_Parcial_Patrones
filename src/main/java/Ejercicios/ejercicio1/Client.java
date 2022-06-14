package Ejercicios.ejercicio1;

public class Client {
    public static void main(String[] args) {
        EditorDoc editorDoc = new EditorDoc();
        Metodo comando = new Metodo();
        GoogleDoc doc;

        String text = "Hola mundo";
        doc = new GoogleDoc(1,text, "guardado");
        comando.setState(doc);
        editorDoc.saveDoc(1,comando.createMemento());

        text = "Patrones";
        doc = new GoogleDoc(2,text, "guardado");;
        comando.setState(doc);
        editorDoc.saveDoc(2,comando.createMemento());

        text = "Patrones de diseno";
        doc = new GoogleDoc(3,text, "guardado");;
        comando.setState(doc);
        editorDoc.saveDoc(3,comando.createMemento());

        text = "Patron memento";
        doc = new GoogleDoc(4,text, "guardado");;
        comando.setState(doc);
        editorDoc.saveDoc(4,comando.createMemento());


        System.out.println("Revertir cambios\n");

        comando.restoreMemento(editorDoc.getState("revertir cambios"));
        comando.restoreMemento(editorDoc.getState("ctrl+z"));
        comando.restoreMemento(editorDoc.getState("ctrl+z"));


        System.out.println("Deshacer cambios\n");

        comando.restoreMemento(editorDoc.getState("deshacer cambios"));
        comando.restoreMemento(editorDoc.getState("ctrl+y"));
        comando.restoreMemento(editorDoc.getState("ctrl+y"));


    }
}