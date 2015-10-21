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
public class Personne {

    private String nom, prenom, nationalite;
    private int age;
    private Personne[] Amis;
    private int nbAmis;

    public Personne(String nom, String prenom, String nationalite, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.age = age;
    }

    public Personne() {
    }

    public Personne(Personne p) {
        nom = p.nom;
        prenom = p.prenom;
        nationalite = p.nationalite;
        age = p.age;
    }

    @Override
    public String toString() {
        return "{" + "nom=" + nom + ", prenom=" + prenom + ", nationalite=" + nationalite + ", age=" + age + '}';
    }

    public void CréerListeAmis() {
        Amis = new Personne[5];

    }

    public void ajouterAmi(Personne p) {

        Amis[nbAmis] = new Personne(p);
        nbAmis += 1;
    }

    public void MaListeAmis() {
        for (int i = 0; i < nbAmis; i++) {
            System.out.println(Amis[i]);
        }
    }

    public void AmisAlgériens() {
        for (int i = 0; i < nbAmis; i++) {
            if ("dz".equals(Amis[i].getNationalite())) {
                System.out.println(Amis[i]);

            }
        }

    }

    public void AmisEtrangers() {
        for (int i = 0; i < nbAmis; i++) {
            if (!"dz".equals(Amis[i].getNationalite())) {
                System.out.println(Amis[i]);

            }
        }

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
