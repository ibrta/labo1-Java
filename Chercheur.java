public class Chercheur {
    private String nom;
    private String poste;
    private int numOrdinateur;
    private static int compteur = 0;

    /**
     * Constructeur complet pour initialiser tous les champs.
     *
     * @param nom           Le nom du chercheur.
     * @param poste         Le poste du chercheur.
     * @param numOrdinateur Le numéro de l'ordinateur du chercheur.
     */
    public Chercheur(String nom, String poste, int numOrdinateur) {
        this.nom = nom;
        this.poste = poste;
        this.numOrdinateur = numOrdinateur;
        compteur++;
    }

    /**
     * Constructeur par défaut qui incrémente le compteur.
     */
    public Chercheur() {
        compteur++;
    }

    // Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getNumOrdinateur() {
        return numOrdinateur;
    }

    public void setNumOrdinateur(int numOrdinateur) {
        this.numOrdinateur = numOrdinateur;
    }

    @Override
    public String toString() {
        return "Chercheur{" +
                "nom='" + nom + '\'' +
                ", poste='" + poste + '\'' +
                ", numOrdinateur=" + numOrdinateur +
                '}';
    }

    /**
     * Compare deux chercheurs en vérifiant l'égalité de leurs attributs.
     *
     * @param ch Le chercheur à comparer avec l'instance courante.
     */
    public void comparer(Chercheur ch) {
        if (this.nom.equals(ch.nom) && this.poste.equals(ch.poste) && this.numOrdinateur == ch.numOrdinateur) {
            System.out.println("Les deux chercheurs sont identiques.");
        } else {
            System.out.println("Les deux chercheurs sont différents.");
        }
    }

    /**
     * Retourne le compteur de chercheurs créés.
     *
     * @return Le compteur de chercheurs créés.
     */
    public static int getCompteur() {
        return compteur;
    }
}