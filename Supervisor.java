package vsc;

public class Supervisor {
private Maquinaria maquina;


public Supervisor(Maquinaria x){
    this.maquina=x;
}

public void supervisarMaquinaria(){
    this.maquina.Operar();
}
public static void main(String[] args) {

camionMinero a = new camionMinero("Ferrari",2);
Supervisor b = new Supervisor(a);

b.supervisarMaquinaria();


}
}
