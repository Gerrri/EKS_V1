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
public abstract class ZustandSpülmaschine {
    abstract void ein(Spuelmaschine sm);
    abstract void aus(Spuelmaschine sm);
    abstract void beenden(Spuelmaschine sm);
    abstract void auswahl(int zahl,Spuelmaschine sm);
    abstract void go(Spuelmaschine sm);
    abstract void unterbrechen(Spuelmaschine sm);
    abstract void fortsetzen(Spuelmaschine sm);
}
