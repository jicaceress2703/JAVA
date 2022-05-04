package ejercicios_condicionales;

import java.util.Scanner;

public class Ejercicios_condicionales {
    /*
    public static void vocales(int x){
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
        if(aux==true){
           System.out.println("El código ASCII coincide con una vocal.");
       }else{
           System.out.println("El código ASCII no representa una vocal.");
       }
    }
    public static void ParImpar(char ch){
        int aux=(int) ch;
        if(aux%2==0){
            System.out.println("El simbolo tiene una representación par");
        }else{
            System.out.println("El simbolo tiene una representación impar");
        }
    }
    public static void Digito(char x){
        int aux=(int) x;
        if(48<=aux && aux<58){
            System.out.println(x+" "+"es dígito");
        }else{
            System.out.println(x+" "+"no es dígito");
        }
    }
    public static void signo(double x){
        if(x<0){
            System.out.println("El número "+x+" es negativo");
        }else if(x==0){
            double aux=Math.abs(x);
            System.out.println("El número "+aux+" es el neutro para la suma");
        }else{
            System.out.println("El número "+x+" es positivo");
        }
    }
    public static void InteriorCirculo(double xc, double yc,double r,double x,double y){
        double aux=Math.pow(x-xc, 2)+Math.pow(y-yc, 2);
        if(aux<Math.pow(r, 2)){
            System.out.println("El punto ("+x+","+y+") es un punto interior al circulo");
        }else{
            System.out.println("El punto ("+x+","+y+") no es un punto interior al circulo");
        }
    }
    public static void Cuadrante(double x,double y){
        if(x>0 && y>0){
            System.out.println("Cuadrante I");
        }else if(x<0 && y>0){
            System.out.println("Cuadrante II");
        }else if(x<0 && y<0){
            System.out.println("Cuadrante III");
        }else if(x>0 && y<0){
            System.out.println("Cuadrante IV");
        }else if(x==0 && y==0){
            System.out.println("Origen de coordenadas");
        }else{
            System.out.println("Ejes");
        }
    }*/
    public static void Triangulo(double x, double y, double z){
        if(x<y+z && y<x+z && z<x+y){
            System.out.println("Estas distancias pueden formar un triángulo.");
        }
    }
    
    public static void main(String[] args) {
       Scanner entrada=new Scanner (System.in);
       /*System.out.print("Ingrese el código ASCII que desea evaluar: ");
       int codigo=Integer.parseInt(entrada.nextLine());
       vocales(codigo);
       System.out.print("Ingrese un caracter: ");
       char caracter=entrada.nextLine().charAt(0);
       ParImpar(caracter);
       System.out.print("Ingrese un caracter: ");
       char caracter= entrada.nextLine().charAt(0);
       Digito(caracter);
       double num=Double.parseDouble(entrada.nextLine());
       signo(num);
       System.out.print("Ingrese la coordenada x del centro del circulo: ");
       double xcentro=Double.parseDouble(entrada.nextLine());
       System.out.print("Ingrese la coordenada y del centro del circulo: ");
       double ycentro=Double.parseDouble(entrada.nextLine());
       System.out.print("Ingrese el radio del circulo: ");
       double radio=Double.parseDouble(entrada.nextLine());*/
       System.out.print("Ingrese una longitud: ");
       double xp=Double.parseDouble(entrada.nextLine());
       System.out.print("Ingrese una longitud: ");
       double xs=Double.parseDouble(entrada.nextLine());
       System.out.print("Ingrese una longitud: ");
       double xt=Double.parseDouble(entrada.nextLine());
       /*System.out.print("Ingrese la coordenada y del punto: ");
       double yp=Double.parseDouble(entrada.nextLine());
       InteriorCirculo(xcentro,ycentro,radio,xp,yp);
       Cuadrante(xp,yp);*/
       Triangulo(xp,xs,xt);
       
    }
    
}
