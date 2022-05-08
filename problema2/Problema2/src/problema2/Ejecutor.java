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
public class Ejecutor {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       Profesor pr = new Profesor();
       pr.establecerSueldoT();
       
       System.out.println("Datos del profesor\n");
       System.out.printf("%s", pr);
       
       
    }
    
}
