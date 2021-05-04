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
public class Donna {
    Semaforo vuoto;

    public Donna(Semaforo vuoto) {    //costruttore
        this.vuoto = vuoto;
    }
    
    public void EntraDonna(){
        vuoto.P();      //prende una risorsa
        System.out.println("Una donna è entrata nel bagno");
        
        
    }
    
    public void EsceDonna(){
        
        System.out.println("Una donna è uscita dal bagno");
        vuoto.V();     //lascia una risorsa
    }
}
