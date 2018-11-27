/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H1_2;

/**
 *
 * @author Dustin
 */
public class main {
    
    public static void main(String[] args) {
        Spuelmaschine sm = new Spuelmaschine();
        
        sm.getZustand();
        sm.ein();
        sm.getZustand();
        sm.auswahl(3);
        sm.getZustand();
        sm.go();
        sm.getZustand();
        sm.unterbrechen();
        sm.getZustand();
        sm.fortsetzen();
        sm.getZustand();
        sm.beenden();
        sm.getZustand();
        
        sm.aus();
        sm.getZustand();
        sm.ein();
        sm.auswahl(4);
        sm.beenden();
        sm.getZustand();
        
        sm.auswahl(2);
        sm.go();
        sm.auswahl(2);
        sm.beenden();
        
        sm.unterbrechen();
        sm.unterbrechen();
        sm.beenden();
        sm.getZustand();
        sm.aus();
        sm.getZustand();
   
    }
    
}
