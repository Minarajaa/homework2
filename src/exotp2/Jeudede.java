/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exotp2;

import java.util.Scanner;

/**
 *
 * @author 1997
 */
public class Jeudede {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb;
        Scanner Clavier = new Scanner(System.in);
        De d = new De();
        Jouer p = new Jouer();
        System.out.println("***********JEU DE Dé***********");
        System.out.print("Nombre de joueurs ");
        nb = Clavier.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println("Tour n°" +( i + 1));
            for (int j = 0; j < nb; j++) {
                int lancer = d.hasard();
                p.setScore(lancer, j);
                System.out.println("joueur " + (j + 1) + " a " + p.getScore(j));

            }
        }
        System.out.println("le gagnant esa le joueur " + (p.gagnant(nb)+1) + " avec le score de: " + p.getScore(p.gagnant(nb)) + " points");
    }

}
