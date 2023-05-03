/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prácticaunidad3;

/**
 * La clase CCuenta representa una cuenta bancaria que contiene los atributos de una cuenta corriente,
 * un titular que es una String, un número de cuenta tipo String que contiene los 20 dígitos de la cuenta corriente,
 * un saldo es un atributo de tipo double que contiene el saldo y un tipo de interés es un atributo de tipo double que contiene el saldo.
 * Permite realizar operaciones como ingresos y retiradas de dinero.
 */
public class CCuenta {

    /**
     * GETTERS AND SETTERS
     */
    /**
     * @param cuenta de tipo string para asignar su valor al atributo cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return devuelve el valor de tipo double del saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo de tipo double para asignar su valor al atributo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return devuelve el valor de tipo double del tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés de tipo double para asignar su valor al atributo tipoInteres.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin argumentos
     */
    public CCuenta ()
    {
    }
    
     /**
     * Constructor con parámetros para construir objeto CCuenta.
     * @param nom de tipo String para asignar su valor al atributo nombre.
     * @param cue de tipo String para asignar su valor al atributo cuenta.
     * @param sal de tipo double para asignar su valor al atributo saldo.
     * @param tipo de tipo double.
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
   
    
    /**
     * Método para asignar el nombre al atributo nombre.
     * @param nom tipo String, asigna su valor al atributo nombre.
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    
    
    /**
     * Método que devuelve el atributo nombre de la clase CCuenta.
     * @return devuelve un String del nombre del titular de la cuenta.
     */
    public String getNombre()
    {
        return nombre;
    }

     /**
     * Método que devuelve el atributo saldo de la clase CCuenta.
     * @return devuelve un valor double del saldo de la cuenta.
     */
     public double getEstado ()
    {
        return getSaldo();
    }

     /**
     * Método que incrementa el saldo de CCuenta a partir del valor double recibido como parámetro.
     * @param cantidad tipo double es la cantidad a ingresar pasada como parámetro.
     * @throws Exception lanza excepción Si la cantidad es menor a 0.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que decrementa el saldo de CCuenta a partir del valor double recibido como parámetro.
     * @param cantidad tipo double es la cantidad a retirar pasada como parámetro.
     * @throws Exception lanza excepción si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que devuelve el atributo cuenta de la clase CCuenta.
     * @return devuelve un valor String de la cuenta.
     */
    public String getCuenta ()
    {
        return cuenta;
    }
}
