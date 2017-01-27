/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pronote;

import java.util.Scanner;

/**
 *
 * @author festouche
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Pronote ---");
        Portail portail;
        portail = new Portail();
        
        int choix ;
        
        do{
            System.out.println("\n\n--- MENU ---");
            System.out.println("0. Quitter");
            System.out.println("1. Connexion");
            
            choix = new Scanner(System.in).nextInt();
            
            switch(choix){
                case 1:
                    System.out.println("\n\n--- CONNEXION ---");
                    System.out.println("1. Professeur");
                    System.out.println("2. Eleve");
                    
                    choix = new Scanner(System.in).nextInt();
                    break;
            }
            
        }while(choix != 0);
    }
    
}
