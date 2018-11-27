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
public class StandBy extends ZustandSpülmaschine{

    @Override
    void ein(Spuelmaschine sm) {
        System.out.println("Methode EIN ist im Zustand STANDBY nicht möglich");
    }

    @Override
    void aus(Spuelmaschine sm) {
        sm.setZustand(new Aus());
    }

    @Override
    void beenden(Spuelmaschine sm) {
        System.out.println("Methode BEENDEN ist im Zustand STANDBY nicht möglich");
    }

    @Override
    void auswahl(int zahl, Spuelmaschine sm) {
        sm.setZustand(new Startbereit());
    }

    @Override
    void go(Spuelmaschine sm) {
        System.out.println("Methode GO ist im Zustand STANDBY nicht möglich");
    }

    @Override
    void unterbrechen(Spuelmaschine sm) {
        System.out.println("Methode UNTERBRECHEN ist im Zustand STANDBY nicht möglich");
    }

    @Override
    void fortsetzen(Spuelmaschine sm) {
        System.out.println("Methode FORTSETZEN ist im Zustand STANDBY nicht möglich");
    }
    
}
