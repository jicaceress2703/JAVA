package ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicios_condicionales {
    public static boolean vocales(int x){
        boolean aux=false;
        switch(x){
            case 97:
                aux=true;
            break;
            case 101:
                aux=true;
            break;
            case 105:
                aux=true;
            break;
            case 111:
                aux=true;
            break;
            case 117:
                aux=true;
            break;
            case 65:
                aux=true;
            break;
            case 69:
                aux=true;
            break;
            case 73:
                aux=true;
            break;
            case 79:
                aux=true;
            break;
            case 85:
                aux=true;
            break;
        }
        return aux;
    }
    
    public static void main(String[] args) {
       Scanner entrada=new Scanner (System.in);
       System.out.print("Ingrese el código ASCII que desea evaluar: ");
       int codigo=Integer.parseInt(entrada.nextLine());
       boolean identificador=vocales(codigo);
       if(identificador==true){
           System.out.println("El código ASCII coincide con una vocal.");
       }else{
           System.out.println("El código ASCII no representa una vocal.");
       }
    }
    
}
