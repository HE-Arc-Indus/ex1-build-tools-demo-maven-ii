package ch.hearc.ig.sda;

/**
 * Personnes
 *
 */
public class App 
{
       public static void main(String[] args) {
        
        Personne personne = new Personne();
        Personne pe = new Personne();
        personne.setNom("Doe");
        personne.setPrenom("John");
        personne.sePresenter();
    }
}
