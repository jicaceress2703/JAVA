package registro;

public class Pregrado extends Estudiante{
    private int cantidad_creditos;
    
    public Pregrado(String nombre,int edad,String programa,String tipo_etnia,int cantidad_creditos){
        super(nombre,edad,programa,tipo_etnia);
        this.cantidad_creditos=cantidad_creditos;
    }

    @Override
    public String toString() {
        return "\tEstudiante Pregrado\n" +super.toString()+ "\tCreditos aprobados: " + cantidad_creditos+"\n";
    }
    
}
