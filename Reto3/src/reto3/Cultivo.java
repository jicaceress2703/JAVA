package reto3;
import java.util.List;
import java.util.ArrayList;
public class Cultivo {
    
    public Cultivo(){
        
    }
    public ArrayList<String> obtenerCultivos(ArrayList<String> lista){
        ArrayList<String> aux=new ArrayList<>();
        for(String x:lista){
            if(aux.indexOf(x)==-1){
                aux.add(x);
            }
        }
        return aux;
    }
    public ArrayList<Integer> obtenerCultivosPendientes(ArrayList<Integer> posh,ArrayList<String> pendientes, String cultivo){
        ArrayList<Integer> aux=new ArrayList<>();
        for(int x:posh){
            if(pendientes.get(x).equals(cultivo)){
                aux.add(x);
            }
        }
        return aux;
    }
    public ArrayList<String> obtenerFaltantes(ArrayList<String> l_otrafinca,ArrayList<String> l_fincamartha){
        ArrayList<String> aux=new ArrayList<>();
        for(String x:l_otrafinca){
            if(l_fincamartha.indexOf(x)==-1 && aux.indexOf(x)==-1){
                    aux.add(x);
                }
        }
        return aux;
    }
    public Integer obtenerExcedentesIntercambiables(List<String> l_otrafinca,List<String> l_fincamartha){
        List<String> martha=new ArrayList<>();
        List<String> otra=new ArrayList<>();
        int cont;
        for(String x:l_otrafinca){
            if(l_fincamartha.indexOf(x)!=-1 && martha.indexOf(x)==-1){
                    martha.add(x);
                }
        }
        for(String x:l_fincamartha){
            if(l_otrafinca.indexOf(x)==-1 && otra.indexOf(x)==-1){
                    otra.add(x);
                }
        }
        if(martha.size()<=otra.size()){
            cont=martha.size();
        }else{
            cont=otra.size();
        }
        return cont;
    }
}
