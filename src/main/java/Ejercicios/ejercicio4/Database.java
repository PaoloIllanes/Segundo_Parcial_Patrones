package Ejercicios.ejercicio4;

import java.util.ArrayList;

public class Database {
    private IEstrategiaOrdenamiento strategy;
    private ArrayList<Libro>libros;
    public Database(){}

    public void ordenar(){
        strategy.ordenar(this.libros);
    }

}
