/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H1_1;

/**
 *
 * @author Dustin
 */
public class Leuchte_zyklisch extends Leuchte {
    int count=0;
    
    @Override
    public void farbeWechseln() {
        
        setAktuelle_farbe(getFarben(count%5));
        
        System.out.println(getAktuelle_farbe());
        
        count++;
    }
    
    
}
