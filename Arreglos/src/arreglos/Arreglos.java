package arreglos;
import java.util.Scanner;
import java.util.Arrays;
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
    public static double[] leerArreglo(Scanner sc,int n){
        double[] vec=new double[n];
        for(int i=1;i<n+1;i++){
            System.out.print("Ingrese el dato "+i+":");
            vec[i-1]=sc.nextDouble();
        }
        return vec;
    }
    public static void media(double[] num){
        double mean=0.0;
        int iter=0;
        while(iter<num.length){
            mean+=num[iter];
            iter+=1;
        }
        mean/=num.length;
        System.out.println("La media del conjunto de datos es: "+mean);
    }
    public static void prodInterno(double[] v,double[] w){
        double prod=0.0;
        for(int i=0;i<v.length;i++){
            prod+=v[i]*w[i];
        }
        System.out.println("El producto interno de los arreglos es: "+prod);
    }
    public static void prodDirecto(double[] v,double[] w){
        String aux="";
        for(int i=0;i<v.length;i++){
            aux+=String.valueOf(v[i]*w[i])+",";
        }
        aux=aux.substring(0,aux.length()-1);
        System.out.println("El producto directo de los arreglos es: ["+aux+"]");
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        /*System.out.print("Ingrese la cadena de caracteres que desea analizar: ");
        String cad=entrada.nextLine();
        System.out.print("Ingrese el caracter que desea buscar: ");
        char caracter=entrada.nextLine().charAt(0);
        contarChar(caracter,cad);
        System.out.print("Ingrese la cadena de caracteres que desea analizar: ");
        String cad=entrada.nextLine();
        verificar(cad);*/
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n=entrada.nextInt();
        double[] v=leerArreglo(entrada,n);
        double[] w=leerArreglo(entrada,n);
        /*prodInterno(v,w);*/
        prodDirecto(v,w);
        
    }
    
}
