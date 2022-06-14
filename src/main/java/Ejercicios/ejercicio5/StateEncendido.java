package Ejercicios.ejercicio5;

public class StateEncendido implements IStateComputadora{

    public int getRandom(int min,int max){

        return (int)((Math.random()*(max-min)+min));

    }

    @Override
    public void handler(Computadora computadora) {
    int nProgramas=getRandom(1,20);
    for(int i=0;i<nProgramas;i++){
        computadora.getProgramasAbiertos().add(String.valueOf(i));
    }
        int ramUsage=computadora.getProgramasAbiertos().size()*5;
        int cpuUsage=ramUsage;
        computadora.getCpu().setUsage(cpuUsage);
        computadora.getRam().setUsage(ramUsage);

        System.out.println("Programas abiertos: "+computadora.getProgramasAbiertos().size());
        System.out.println("Uso de cpu: "+computadora.getCpu().getUsage()+"%");
        System.out.println("Uso de ram: "+computadora.getRam().getUsage()+"%");


    }
}
