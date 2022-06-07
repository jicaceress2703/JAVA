package reto3;

import java.util.ArrayList;

public class Reto3 {

    public static void main(String[] args) {
        ArrayList<String> cult1 = new ArrayList<>();
        ArrayList<String> cult2 = new ArrayList<>();
        cult1.add("22");
        cult1.add("19");
        cult1.add("16");
        cult1.add("20");
        cult1.add("3");
        cult1.add("25");
        cult1.add("9");
        cult1.add("8");
        cult1.add("18");
        cult1.add("2");
        cult1.add("12");
        cult1.add("14");
        cult1.add("24");
        cult1.add("7");
        cult1.add("13");
        cult2.add("18");
        cult2.add("13");
        cult2.add("35");
        cult2.add("0");
        cult2.add("34");
        cult2.add("27");
        cult2.add("30");
        cult2.add("23");
        cult2.add("10");
        cult2.add("31");
        cult2.add("5");
        cult2.add("11");
        cult2.add("12");
        Cultivo aux=new Cultivo();
        /*
        ArrayList<String> y=aux.obtenerFaltantes(cult1,cult2);
        y.forEach(x -> {
            System.out.println(x);
        });*/
        int y=aux.obtenerExcedentesIntercambiables(cult1, cult2);
        System.out.println(y);
    }
    

}
