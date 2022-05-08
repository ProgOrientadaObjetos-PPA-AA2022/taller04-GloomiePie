/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author Usuario
 */
public class Auto {
    
    private String cedula;
    private String marca;
    private int añoF;
    private double valorVe;
    private double valorMa;
    
    public Auto(){
        cedula = "116907527";
        marca = "Toyota";
        añoF = 2000;
        valorVe = 10520.90;        
    }
    public Auto(String ced, String mar, int aFab, double vVenta){
        ced = cedula;
        mar = marca;
        aFab = añoF;
        vVenta = valorVe;
    }
    
    public void establecerCedula(String c){
       cedula = c; 
    }
    public void establecerMarca(String c){
        marca = c;
    }
    public void establecerAñoF(int c){
        añoF = c;
    }
    public void establecerValorVe(double c){
        valorVe = c;
    }
    public void establecerValorMa(){
        valorMa = (valorVe*añoF)*0.002;
    }
    public String obtenerCedula(){
        return cedula;
    }
    public String obtenerMarca(){
        return marca;
    }
    public int obtenerAñoF(){
        return añoF;
    }
    public double obtenerValorVe(){
        return valorVe;
    }
    public double obtenerValorMa(){
        return valorMa;
    }
    @Override
    public String toString() {
        String cadena = String.format("Datos del vehículo\n"
                + "Cédula del dueño: %s\nMarca del vehículo: "
                + "%s\nAño de fabricación: %d\nValor del vehículo: "
                + "%.2f $\nValor de la matrícula: %.2f $",
                obtenerCedula(), obtenerMarca(),
                obtenerAñoF(),obtenerValorVe(),
                obtenerValorMa());
        return cadena;
    }
}
