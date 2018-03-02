/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.sda.personne;

/**
 *
 * @author odile.eichenbe
 */
public class Personne {
    String nom;
    String prenom;

    public Personne() {
   
    }
    

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void sePresenter(){
        System.out.println("Bonjour je m'appelle" + this.prenom + " " + this.nom);
    }

    
}
