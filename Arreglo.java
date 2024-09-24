package vsc;

import java.util.ArrayList;

public class Arreglo {

    private ArrayList<Maquinaria> arreglito= new ArrayList<>();

    Arreglo(Maquinaria x){
        arreglito.add(x);
    }
    public void agregarMaqui(Maquinaria x){
        arreglito.add(x);
    }

public void arrancarMaquinas(){
    for(int i =0;i< arreglito.size();i++){
        arreglito.get(i).Operar();

    }
}

public static void main(String[] args) {
    
    Maquinaria a= new Excavadora("Ferrari",2);
    Maquinaria b= new camionMinero("Lamborghini",3);
    Maquinaria c = new Excavadora("Renault12",25);

    Arreglo arr = new Arreglo(a);
    arr.agregarMaqui(b);
    arr.agregarMaqui(c);

    arr.arrancarMaquinas();

}




}
