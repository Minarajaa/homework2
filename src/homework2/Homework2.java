/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

/**
 *
 * @author 1997
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne p1 = new Personne("a", "lila", "en", 41);
        Personne p2 = new Personne("b", "asma", "dz", 29);
        Personne p3 = new Personne("c", "ikram", "dz", 20);
        Personne p4 = new Personne("d", "sara", "fr", 17);
        Personne p5 = new Personne("e", "hanane", "dz", 33);
        Personne p = new Personne();
        p.setNom("o");
        p.setPrenom("latifa");
        p.setNationalite("dz");
        p.setAge(22);
        System.out.println(p);
        System.out.println();
        //Création d'une liste de Contacts
        p.CréerListeAmis();

        //l'ajout des amis...
        p.ajouterAmi(p1);
        p.ajouterAmi(p2);
        p.ajouterAmi(p3);
        p.ajouterAmi(p4);
        p.ajouterAmi(p5);

        System.out.println("Mes amis sont ...\n");
        p.MaListeAmis();
        System.out.println();

        System.out.println("Mes amis algériens sont:\n");
        p.AmisAlgériens();
        System.out.println();

        System.out.println("Mes amis étrangers sont:\n");
        p.AmisEtrangers();

    }

}
