/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosaleatorios;

import java.io.Serializable;

/**
 *
 * @author a20pelayoar
 */
public class Duplex extends Piso implements Serializable{
    
    float cuotaExtra;

    @Override
    public float totalRbo() {
        float totalRbo = cuota + agua * 0.40f + calefa * 0.70f + cuotaExtra;
        return totalRbo;
    }
    
    
    @Override
    public String toString(){
        return "Referencia: " + this.referencia + "\nPropietario: " + this.nombrePropietario;
    }
    
}
