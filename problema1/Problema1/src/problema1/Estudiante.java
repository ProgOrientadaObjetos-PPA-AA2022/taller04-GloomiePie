/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
            
    public Estudiante(){
        nombre = "Max Velázquez";
        nota1 = 8.2;
        nota2 = 9.3;
        nota3 = 7.9;
    }
    public Estudiante(String nom, double not1, double not2,
            double not3){
        nom = nombre;
        not1 = nota1;
        not2 = nota2;
        not3 = nota3;
    }
    
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerNota1(double c){
        nota1 = c;
    }
    public void establecerNota2(double c){
        nota2 = c;
    }
    public void establecerNota3(double c){
        nota3 = c;
    }
    public void establecerPromedio(){
        promedio = (nota1 + nota2+ nota3)/3;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public double obtenerNota1(){
        return nota1;
    }
    public double obtenerNota2(){
        return nota2;
    }
    public double obtenerNota3(){
        return nota3;
    }
    public double obtenerPromedio(){
        return promedio;
    }
    @Override
    
    public String toString(){
        String cadena = String.format("Datos del estudiante\n"
                + "Nombre: %s\nCalificación 1: %.2f\n"
                + "Calificaión 2: %.2f\n"
                + "Calificación 3: %.2f\n"
                + "Calificación total: %.2f\n",
                obtenerNombre(),obtenerNota1(),
                obtenerNota2(), obtenerNota3(),
                obtenerPromedio());
        
        return cadena;
    }
}
