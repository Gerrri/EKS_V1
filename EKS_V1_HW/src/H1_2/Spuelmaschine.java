/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package H1_2;

public class Spuelmaschine {
    private ZustandSpülmaschine zustand = new Aus();
   
    void ein(){
        zustand.ein(this);
    }
    void aus(){
        zustand.aus(this);
    }
    
    void beenden(){
        zustand.beenden(this);
    }
    
    void auswahl(int zahl){
        zustand.auswahl(zahl, this);
    }
    
    void go(){
        zustand.go(this);
    }
    
    void unterbrechen(){
        zustand.unterbrechen(this);
    }
    
    void fortsetzen(){
        zustand.fortsetzen(this);
    }

    public ZustandSpülmaschine getZustand() {
       
        System.out.println("Spülmaschine ist im Zustand " + zustand.getClass().toString().substring(11) +".");
        return zustand;
    }

    public void setZustand(ZustandSpülmaschine zustand) {
        this.zustand = zustand;
    }
    
}
