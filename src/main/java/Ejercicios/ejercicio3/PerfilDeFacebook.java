package Ejercicios.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PerfilDeFacebook implements IPerfil {
    private List<IUsuario> observers = new ArrayList<>();
    private List<Publicacion> publications = new ArrayList<>();

    public void uploadNewPublication(Publicacion publicacion){
        publications.add(publicacion);
        this.notifyObserver(publicacion);
    }

    @Override
    public void attach(IUsuario observer) {
        observers.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Publicacion publicacion) {
        for (IUsuario facebookUser: observers) {
            if (facebookUser.getCategoria().equals(publicacion.getCategoria()) || facebookUser.getCategoria().equals("TODOS") ){
                facebookUser.update("Publicación: " + publicacion.getTitulo(), publicacion);
            }
        }
    }
}
