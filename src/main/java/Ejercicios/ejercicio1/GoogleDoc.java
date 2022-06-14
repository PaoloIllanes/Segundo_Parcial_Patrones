package Ejercicios.ejercicio1;

public class GoogleDoc {
    private int id;
    private String text;
    private String saveState;

    public GoogleDoc(int id,String text,String saveState){

        this.saveState=saveState;
        this.id=id;
        this.text=text;

    }
    public void showInfo(){
        System.out.println("Id: "+id);
        System.out.println("Text: "+text);
        System.out.println("Estado: "+saveState);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSaveState() {
        return saveState;
    }

    public void setSaveState(String saveState) {
        this.saveState = saveState;
    }
}
