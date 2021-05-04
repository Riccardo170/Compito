/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compito;

/**
 *
 * @author informatica
 */
public class Compito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(1);
        Semaforo vuoto = new Semaforo(1);
        Uomo u = new Uomo(pieno);
        Donna d= new Donna(vuoto);
        Persona b1 = new Persona(pieno,vuoto,u,d);
        Persona b2 = new Persona(pieno,vuoto,u,d);
        Persona b3 = new Persona(pieno,vuoto,u,d);
       
        b1.start();
        b2.start();
        b3.start();
       
    }
    
}
