package Ejercicios.ejercicio2;

public class Client {
    public static void main (String[] args){
        ChatEducativo chat = new ChatEducativo();

        Estudiante estudiante1 =  new Estudiante(chat, "jose",643634, true,false,false);
        Estudiante estudiante2 =  new Estudiante(chat, "miguel",65656, false,true,false);
        Estudiante estudiante3 =  new Estudiante(chat, "Juan",777, true,true,false);
        Estudiante estudiante4 =  new Estudiante(chat, "pedro",888, true,false,false);
        Estudiante estudiante5 =  new Estudiante(chat, "julio",999, false,false,true);



        Administrativo administrativo1 = new Administrativo(chat,"Carlos",234,"Secretaria");
        Administrativo administrativo2 = new Administrativo(chat,"alexo",111,"Administador");
        Administrativo administrativo3 = new Administrativo(chat,"maria",222,"Secretaria General");


        Docente docente1 =  new Docente(chat, "pablo", 444);
        Docente docente2 =  new Docente(chat, "rosa", 55);
        Docente docente3 =  new Docente(chat, "mariana", 5555);


        chat.addPeopleToList(estudiante1);
        chat.addPeopleToList(estudiante2);
        chat.addPeopleToList(estudiante3);
        chat.addPeopleToList(estudiante4);
        chat.addPeopleToList(estudiante5);
        chat.addPeopleToList(docente1);
        chat.addPeopleToList(docente2);
        chat.addPeopleToList(docente3);
        chat.addPeopleToList(administrativo1);
        chat.addPeopleToList(administrativo2);
        chat.addPeopleToList(administrativo3);

        //send msgs
        estudiante1.send("Hola  Docentes");
        System.out.println();
        estudiante5.send("Hola a todos");
        System.out.println();
        estudiante2.send("Hola Administrativos que tal");
        System.out.println();
        docente1.send("Hola docentes y alumnos");
        System.out.println();
        administrativo1.send("Hola a todos");

    }

}
