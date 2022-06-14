package Ejercicios.ejercicio3;

public class UsuarioRegistrado implements IUsuario {
    private String categoria;
    private Persona persona;

    public UsuarioRegistrado(Persona persona, String categoria) {
        this.persona=persona;
        this.categoria=categoria;
    }

    @Override
    public void update(String message, Publicacion publicacion) {
        System.out.println("Notificacion--------------");
        System.out.println(message);
        persona.info();
        publicacion.info();
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }
}