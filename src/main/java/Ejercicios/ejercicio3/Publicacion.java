package Ejercicios.ejercicio3;

public class Publicacion {
    private String titulo;
    private String categoria;

    public Publicacion(String titulo, String categoria){
        this.titulo=titulo;
        this.categoria= categoria;
    }

    public void info(){
        System.out.println("Título    : "+titulo);
        System.out.println("Tipo de Publicacion: "+categoria );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
