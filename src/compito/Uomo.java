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
public class Uomo {
    Semaforo pieno;

    public Uomo(Semaforo pieno) {
        this.pieno = pieno;
    }
    
    public void EntraUomo(){
        pieno.P();    //prende la risorsa
        System.out.println("Un uomo è entrato nel bagno");
        
        
    }
    public void EsceUomo(){
        
        System.out.println("Un uomo è uscito dal bagno");
        pieno.V();    //lascia una risorsa
    }
}
