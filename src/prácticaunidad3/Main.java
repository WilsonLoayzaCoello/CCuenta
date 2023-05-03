/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticaunidad3;

/**
 *
 * @author ED05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CCuenta cuenta1 = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        operativa_cuenta(cuenta1, 695); 
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try
        {
            cuenta1.retirar(2300);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        try
        {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        double saldoActual = cuenta1.getEstado();
        System.out.println("El saldo actual es"+ saldoActual );
    }

}
