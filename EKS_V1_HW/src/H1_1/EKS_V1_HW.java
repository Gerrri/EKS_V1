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
public class EKS_V1_HW {

    public static void main(String[] args) {
        Leuchte_fest        l_fest      = new Leuchte_fest();
        Leuchte_zufall      l_zufall    = new Leuchte_zufall();
        Leuchte_zyklisch    l_zyklisch  = new Leuchte_zyklisch();
        
        
        
        System.out.println("## FEST ##");
        l_fest.einschalten();
        
        System.out.println("## ZUFALL ##");
        l_zufall.einschalten();
        
        System.out.println("## ZYKLISCH ##");
        l_zyklisch.einschalten();
        
 
        
       
    }
    
}
