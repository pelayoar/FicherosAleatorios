/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosaleatorios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a20pelayoar
 */
public class FicherosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Piso> pisos = new ArrayList<Piso>();
        
        Piso piso1 = new Atico("374827KL", "Jose Manuel", 29.0f, 20.0f, 10.0f);
        Piso piso2 = new Duplex();
                
        
        pisos.add(piso1);
        pisos.add(piso2);
        
        try{
            System.out.println("Guardando...");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pisos.dat"));
            
            oos.writeObject(pisos);
            oos.close();
            
            System.out.println("\n¡GUARDADO CORRECTO!\n");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        try{
            ArrayList arraylist = new ArrayList();
            
            System.out.println("Leyendo datos: ");
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pisos.dat"));
            arraylist = (ArrayList<Object>)ois.readObject();
            ois.close();
            
            for (int i = 0; i < arraylist.size(); i++){
                System.out.println(arraylist.get(i).toString());
            }
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
    
    
    public static void altas(Piso piso){
        
    }
    
}
