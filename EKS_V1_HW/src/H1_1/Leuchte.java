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
public abstract class Leuchte {
    private String aktuelle_farbe;
    private String[] farben = {"rot","gelb","grün","blau","weiß"};
    
    public Leuchte() {
    }
    
    
    public void einschalten(){  
       //10 x Farbwechsel aufrufen
       for(int i = 0; i<10 ; i++){
           farbeWechseln();
       } 
    }
    
    //muss von Unterklassen implementiert werden
    abstract void farbeWechseln();
    
    //getter
    public String getFarben(int i) {
        return farben[i];
    }

    public String getAktuelle_farbe() {
        return aktuelle_farbe;
    }

    public void setAktuelle_farbe(String aktuelle_farbe) {
        this.aktuelle_farbe = aktuelle_farbe;
    }
    
    
    
    

}
