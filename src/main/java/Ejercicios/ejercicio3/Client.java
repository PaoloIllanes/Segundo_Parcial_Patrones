package Ejercicios.ejercicio3;

public class Client {
    public static void main (String []args){

        PerfilDeFacebook perfilDeFacebook = new PerfilDeFacebook();

        UsuarioRegistrado user1 = new UsuarioRegistrado(new Persona("6546","pedro"),"VIDEO");
        UsuarioRegistrado user2 = new UsuarioRegistrado(new Persona("45656","jose"),"IMAGEN");
        UsuarioRegistrado user3 = new UsuarioRegistrado(new Persona("666","manuela"),"TODOS");
        UsuarioRegistrado user4 = new UsuarioRegistrado(new Persona("888","edgar"),"TODOS");
        UsuarioRegistrado user5 = new UsuarioRegistrado(new Persona("777","patrick"),"IMAGEN");

        perfilDeFacebook.attach(user1);
        perfilDeFacebook.attach(user2);
        perfilDeFacebook.attach(user3);
        perfilDeFacebook.attach(user4);
        perfilDeFacebook.attach(user5);

        perfilDeFacebook.uploadNewPublication(new Publicacion("Video de prueba","VIDEO"));
        perfilDeFacebook.uploadNewPublication(new Publicacion("Profile picture","IMAGEN"));
    }
}
