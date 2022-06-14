package Ejercicios.ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatEducativo implements ICanalDeComunicacion{
    private Map<Integer, Colleague> schoolChat = new HashMap<>();
    private List<Integer> idList = new ArrayList<>();
    int key;

    public void addPeopleToList(Colleague peopletoAdd){
        if(peopletoAdd instanceof Estudiante){
            Estudiante student = (Estudiante)peopletoAdd;
            key = student.getMatricula();
            idList.add(key);
            addPeopleToMap(key, peopletoAdd);
        }else if (peopletoAdd instanceof Docente){
            Docente teacher = (Docente)peopletoAdd;
            key = teacher.getCi();
            idList.add(key);
            addPeopleToMap(key, peopletoAdd);
        }else if (peopletoAdd instanceof Administrativo){
            Administrativo student = (Administrativo) peopletoAdd;
            key = student.getId();
            idList.add(key);
            addPeopleToMap(key, peopletoAdd);
        }
    }

    public void addPeopleToMap(int id, Colleague persona){
        schoolChat.put(id,persona);
    }

    @Override
    public void send(String message, Colleague colleague) {
        Colleague personaParseOrigen = colleague;
        for (int people : idList){
            if (personaParseOrigen instanceof Administrativo) {
                Administrativo administrativo = (Administrativo)personaParseOrigen;
                if(people != administrativo.getId()){
                    schoolChat.get(people).messageReceived(message);
                }
            } else if (personaParseOrigen instanceof Docente && (schoolChat.get(people) instanceof Docente
                    || schoolChat.get(people) instanceof Estudiante)) {
                Docente docente = (Docente)personaParseOrigen;
                if(people != docente.getCi()){
                    schoolChat.get(people).messageReceived(message);
                }
            } else if (personaParseOrigen instanceof Estudiante && (schoolChat.get(people) instanceof Docente
                    || schoolChat.get(people) instanceof Administrativo)){
                Estudiante estudiante = (Estudiante) personaParseOrigen;
                if(people != estudiante.getMatricula() && estudiante.isSendAll()){
                    schoolChat.get(people).messageReceived(message);
                } else if(people != estudiante.getMatricula() && estudiante.isSendAdmin() && schoolChat.get(people) instanceof Administrativo){
                    schoolChat.get(people).messageReceived(message);
                } else  if(people != estudiante.getMatricula() && estudiante.isSendTeacher()  && schoolChat.get(people) instanceof Docente){
                    schoolChat.get(people).messageReceived(message);
                }
            }
        }
    }
}
