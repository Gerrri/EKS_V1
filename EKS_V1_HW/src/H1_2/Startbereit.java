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
public class Startbereit extends ZustandSpülmaschine {

    @Override
    void ein(Spuelmaschine sm) {
        System.out.println("Methode EIN ist im Zustand STARTBEREIT nicht möglich");
    }

    @Override
    void aus(Spuelmaschine sm) {
        System.out.println("Methode AUS ist im Zustand STARTBEREIT nicht möglich");
    }

    @Override
    void beenden(Spuelmaschine sm) {
        sm.setZustand(new StandBy());
    }

    @Override
    void auswahl(int zahl, Spuelmaschine sm) {
       System.out.println("Methode AUSWAHL ist im Zustand STARTBEREIT nicht möglich");
    }

    @Override
    void go(Spuelmaschine sm) {
        sm.setZustand(new Spuelt());
    }

    @Override
    void unterbrechen(Spuelmaschine sm) {
        System.out.println("Methode UNTERBRECHEN ist im Zustand STARTBEREIT nicht möglich");
    }

    @Override
    void fortsetzen(Spuelmaschine sm) {
        System.out.println("Methode FORTSETZEN ist im Zustand STARTBEREIT nicht möglich");
    }
    
    
}
