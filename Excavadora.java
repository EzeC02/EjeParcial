package vsc;

public class Excavadora extends Maquinaria {

    public Excavadora(String x,int y){
        super(x,y);

    }

   @Override
   public void Operar(){
    System.out.println("Excavadora operando ");
   } 

}
