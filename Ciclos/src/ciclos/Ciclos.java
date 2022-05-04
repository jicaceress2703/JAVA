package ciclos;
import java.util.Scanner;
public class Ciclos {
    /*public static void cuadrados(int N){
        int i=0;
        while(i<=N){
            System.out.println(i+" "+i*i);
            i=i+1;
        }
    }
    public static void ParImpar(int N){
        int auximpar;
        for(int i=0;i<=N;i=i+2){
            if(i==0){
                System.out.println(i);
            }else{
                auximpar=i-1;
                System.out.println(auximpar+" "+i);
            }
        }
        if(N%2!=0){
            System.out.println(N);
        }
    }
    public static void ParesMenores(int N){
        for(int i=N;2<=i;i=i-2){
            System.out.println(i);
        }
    }
    public static void Poblaciones(double A,double B){
        double auxA=A;
        double auxB=B;
        int contador=0;
        while(auxB<auxA){
            auxA=auxA+0.02*auxA;
            auxB=auxB+0.03*auxB;
            contador=contador+1;
        }
        System.out.println("La población del pais B superará a la población del pais A después de: "+contador+" años");
        System.out.println("La población del pais A será: "+auxA+" y la población del pais B será: "+auxB);
    }*/
    /*public static void Epsilon(){
        int contador=0;
        double epsilon=1;
        while(0<epsilon){
            epsilon=1/Math.pow(epsilon, contador+1);
            contador=contador+1;
        }
        System.out.println("El valor más pequeño almacenado es: "+epsilon);
    }Queda pendiente por realizar*/
    public static int factorial(int n){
        int aux=1;
        if(n==0){
            return 1;
        }else{
            for(int i=1;i<=n;i++){
                aux=aux*i;
            }
            return aux;
        }
    }
    public static double exponencial(double x, int n){
        double serie=0;
        for(int i=0;i<=n;i++){
            serie=serie+Math.pow(x,i)/factorial(i);
        }
        return serie;
    }
    public static double seno(double x,int n){
        double serie=0;
        for(int i=0;i<=n;i++){
            serie=serie+Math.pow(-1,i)*Math.pow(x,2*i+1)/factorial(2*i+1);
        }
        return serie;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        /*System.out.print("Ingrese el número de cuadrados que desea: ");
        System.out.print("Ingrese el número máximo sobre el cual quiere halla pares e impares: ");
        System.out.print("Ingrese el número inicial: ");
        int n=Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese la población del pais A: ");
        double pobA=Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese la población del pais B: ");
        double pobB=Double.parseDouble(entrada.nextLine());*/
        /*cuadrados(n);
        ParImpar(n);
        ParesMenores(n);
        Poblaciones(pobA,pobB);*/
        System.out.println("Ingrese el orden de la serie: ");
        int N=Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el punto donde desea evaluar la serie: ");
        double point=Double.parseDouble(entrada.nextLine());
        double result=seno(point,N);
        System.out.println("El valor de la exponencial es: "+result);
    }
    
}
