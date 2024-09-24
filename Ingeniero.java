package vsc;



public class Ingeniero {

private String nombre;
private int anioDeExperiencia;
private String especialidad;

public String getNombre(){
    return nombre;
}
public int getAni(){
    return anioDeExperiencia;
}
public String getEspecialidad(){
return especialidad;
    
}
public Ingeniero(){};
public Ingeniero(String x,int y,String z){
    this.anioDeExperiencia=y;
    this.nombre=x;
    this.especialidad=z;
}
public static void main(String[] args) {
    
    Ingeniero a = new Ingeniero("alan",20,"electricidad");
    System.out.println(a.getAni());
    System.out.println(a.getEspecialidad());
    System.out.println(a.getNombre());
}


}
