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
public class Persona extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    Uomo u;
    Donna d;
    

    public Persona(Semaforo pieno, Semaforo vuoto, Uomo u, Donna d) { //costruttore
        this.pieno = pieno;
        this.vuoto = vuoto;
        this.u = u;
        this.d = d;
        
    }
    
    public void run(){
      u.EntraUomo();  //metodo entrata dell'uomo nel bagno
      d.EntraDonna(); //metodo entrata di una donna nel bagno
      u.EsceUomo();   //metodo uscita uomo da un bagno
      d.EsceDonna();  //metodo uscita donna da un bagno
  
    }
}
