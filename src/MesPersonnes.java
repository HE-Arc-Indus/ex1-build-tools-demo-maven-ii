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
public class MesPersonnes {
    
    public static void main(String[] args) {
        
        Personne personne = new Personne();
        Personne pe = new Personne();
        personne.setNom(" John ");
        personne.setPrenom(" Doe ");
        personne.sePresenter();
    }
}
