/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosaleatorios;

/**
 *
 * @author a20pelayoar
 */
public abstract class Piso {
 
    String referencia;
    char tipoPiso;
    String nombrePropietario;
    float cuota;
    float agua;
    float calefa;
    float totalReciboComunidad;
    
    public abstract float totalRbo();
    
    
}
