package arreglos;
import java.util.Scanner;
public class Arreglos {
    public static void contarChar(char ch,String cadena){
        int cont=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==ch){
                cont=cont+1;
            }
        }
        System.out.println(cont);
    }
    public static void verificar(String cadena){
        int cont=0;
        for(int i=0;i<cadena.length();i++){
            int aux=cadena.charAt(i);
            if(aux>=65 && aux<=90){
                cont=cont+1;
            }else if(aux>=97 && aux<=122){
                cont++;
            }            
        }
        if(cont==cadena.length()){
            System.out.println("En la cadena solo hay letras.");
        }
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        /*System.out.print("Ingrese la cadena de caracteres que desea analizar: ");
        String cad=entrada.nextLine();
        System.out.print("Ingrese el caracter que desea buscar: ");
        char caracter=entrada.nextLine().charAt(0);
        contarChar(caracter,cad);*/
        System.out.print("Ingrese la cadena de caracteres que desea analizar: ");
        String cad=entrada.nextLine();
        verificar(cad);
    }
    
}
