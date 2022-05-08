/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author Usuario
 */
public class Profesor {
    
    private String nombre;
    private String apellido;
    private double sueldoB;
    private double sueldoT;
    private String cedula;
    
    public Profesor(){
       nombre = "Alex";
       apellido = "Suárez";
       sueldoB = 200;
       cedula = "1103674510"; 
    }
    
    public Profesor(String nom, String apel, double sBasico,
                String ced){
        nom = nombre;
        apel = apellido;
        sBasico = sueldoB;
        ced = cedula;
    }
    
    
    public void establecerNombre(String c){
        nombre = c;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void establecerApellido(String c){
       apellido = c;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public void establecerSueldoB(double c){
        sueldoB = c;
    }
    public double obtenerSueldoB(){
        return sueldoB;
    }
    public void establecerSueldoT(){
        sueldoT = sueldoB + (sueldoB*0.20);
    }
    public double obtenerSueldoT(){
        return sueldoT;
    }
    public void establecerCedula(String c){
        cedula = c;
    }
    public String obtenerCedula(){
        return cedula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\nSueldo básico: %.2f$\n"
                + "Sueldo total: %.2f$\nCédula: %s\n", obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoB(),
                obtenerSueldoT(),
                obtenerCedula());
        return cadena;
        
    }
}
