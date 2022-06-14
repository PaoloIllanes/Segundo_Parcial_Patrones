package Ejercicios.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class EditorDoc {
    final Map<Integer,DocVersion> stateSaved= new HashMap<>();
    private int version;
    private int lastVersion;

    public void saveDoc(Integer version,DocVersion docVersion){
        setVersion(version);
        setLastVersion(version);
        stateSaved.put(version,docVersion);

    }

    public DocVersion getState(String method){
        int ver= version;
        if(method.toUpperCase().equals("REVERTIR CAMBIOS")||method.toUpperCase().equals("CTRL+Z")&&ver-1!=0){
            setVersion(version-1);
            return stateSaved.get(ver-1);
        }else if(method.toUpperCase().equals("DESHACER CAMBIOS")||method.toUpperCase().equals("CTRL+Y")&&ver+1<=lastVersion){
            setVersion(version+1);
            return stateSaved.get(ver+1);

        }else{
           System.out.println("comando invalido");
           return stateSaved.get(ver);
        }

    }


    public void setVersion(int version){
        this.version= version;
    }

    public Map<Integer, DocVersion> getStateSaved() {
        return stateSaved;
    }

    public int getVersion() {
        return version;
    }

    public int getLastVersion() {
        return lastVersion;
    }

    public void setLastVersion(int lastVersion) {
        this.lastVersion = lastVersion;
    }
}
