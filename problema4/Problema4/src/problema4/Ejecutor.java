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
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cheque ch = new Cheque();
        ch.establecerComision();
        
        System.out.printf("%s", ch);
    }
    
}
