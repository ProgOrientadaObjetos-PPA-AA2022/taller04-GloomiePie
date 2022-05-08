/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author Usuario
 */
public class Cheque {
    
    private String nombreC;
    private String nombreB;
    private double valorCh;
    private double comision;
    
    public Cheque(){
        nombreC = "Arturo Díaz";
        nombreB = "Banco Pichincha";
        valorCh = 12000;
    }
    public Cheque(String nCli, String nBan, double vChe){
        nCli = nombreC;
        nBan = nombreB;
        vChe = valorCh;
    }
    
    public void establecerNombreC(String c){
        nombreC = c;
    }
    public void establecerNombreB(String c){
        nombreB = c;
    }
    public void establecerValorCh(double c){
        valorCh = c;
    }
    public void establecerComision(){
        comision = valorCh*0.003;
    }
    public String obtenerNombreC(){
        return nombreC;
    }
    public String obtenerNombreB(){
        return nombreB;
    }
    public double obtenerValorCh(){
        return valorCh;
    }
    public double obtenerComision(){
        return comision;
    }
    @Override
    public String toString(){
      String cadena = String.format("Datos del cheque\n"
      + "Nombre del cliente: %s\nNombre del banco: "
              + "%s\nValor del cheque: %.2f $\nComisión: %.2f $\n",
              obtenerNombreC(), obtenerNombreB(),
              obtenerValorCh(), obtenerComision());
      return cadena;
    }
}
