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
public class Atico extends Piso{

    float mTerraza;
    
    
    public Atico(String referncia, String nombrePropietario, float cuotaFija, float agua,
            float calefa){
        this.referencia = super.referencia;
        tipoPiso = 'A';
        nombrePropietario = super.nombrePropietario;
        cuotaFija = super.cuota;
        agua = super.agua;
        calefa = super.calefa;
        
        super.totalReciboComunidad = this.totalRbo();
        
    }
    
    @Override
    public float totalRbo() {

        float totalRbo = cuota + agua * 0.40f + calefa * 0.70f + (0.45f * mTerraza);
        
        return totalRbo;
        
    }
    
    
    @Override
    public String toString(){
        return "Referencia: " + this.referencia + "\nPropietario: " + this.nombrePropietario;
    }
    

}
