package registro;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

    private ArrayList<Estudiante> estudiantes;

    public Registro() {
        estudiantes = new ArrayList<>();
    }

    public boolean agregarEstudiante(String estudiante) {
        String[] aux = estudiante.split("&");
        if (aux[1].equals("Pregrado")) {
            Estudiante est;
            est = new Pregrado(aux[2], Integer.parseInt(aux[3]), aux[4], aux[5], Integer.parseInt(aux[6]));
            estudiantes.add(est);
        } else if (aux[1].equals("Posgrado")) {
            Estudiante est;
            est = new Posgrado(aux[2], Integer.parseInt(aux[3]), aux[4], aux[5], aux[6]);
            estudiantes.add(est);
        }
        return true;
    }

    public boolean listarEstudiantes() {
        String aux = "";
        for (Estudiante i : estudiantes) {
            aux = aux + i.toString();
        }
        System.out.println("***Listado de estudiantes***");
        System.out.print(aux);
        return true;
    }

    public boolean procesarComandos(String entrada) {
        String[] aux=entrada.split("&");
        int iter=Integer.parseInt(aux[0]);
        if(iter==1){
            agregarEstudiante(entrada);
            return true;
        }else if(iter==2){
            listarEstudiantes();
            return true;
        }
        return false;
        
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Registro nuevo = new Registro();
        String alumno;
        boolean it = true;
        while (it) {       
            alumno = entrada.nextLine();
            it = nuevo.procesarComandos(alumno);
        }
    }

}
