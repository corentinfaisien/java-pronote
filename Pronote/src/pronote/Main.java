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
        String Identifiant;
        String mdp;
        
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
                    System.out.println("3. Retour vers le menu");
                    choix = new Scanner(System.in).nextInt();
                    break;
                    
            }
            switch(choix){
                case 1:
                    System.out.println("\n\n--- CONNEXION PROFESSEUR ---");
                    System.out.println("Identifiant : ");
                    Identifiant = new Scanner(System.in).nextLine();
                    System.out.println("\n\nMot de passe : ");
                    mdp = new Scanner(System.in).nextLine();
                    // si l'identifiant et le mot de passe corespondent (BDD):
                    // affiche la liste des élèves via la BDD.
                    break;
                case 2:
                    System.out.println("\n\n--- CONNEXION ELEVE ---");
                    System.out.println("Identifiant : ");
                    Identifiant = new Scanner(System.in).nextLine();
                    System.out.println("\n\nMot de passe : ");
                    mdp = new Scanner(System.in).nextLine();
                    // si l'identifiant et le mot depasse corespondent :
                    System.out.println("\n\n--- ESPACE ELEVE ---");
                    System.out.println("1. Voir mes notes");
                    System.out.println("2. Voir mes appréciations");
                    System.out.println("3. Retour vers le menu");
                    choix = new Scanner(System.in).nextInt();
            }
            
        }while(choix != 0);
    }
    
}
