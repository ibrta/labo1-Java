public class Adresse {
    private String gouvernorat;
    private String ville;
    private int codePostal;

    /**
     * Constructeur complet pour initialiser tous les champs.
     *
     * @param gouvernorat Le gouvernorat de l'adresse.
     * @param ville       La ville de l'adresse.
     * @param codePostal  Le code postal de l'adresse.
     */
    public Adresse(String gouvernorat, String ville, int codePostal) {
        this.gouvernorat = gouvernorat;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    /**
     * Constructeur partiel pour initialiser la ville et le code postal.
     * Le gouvernorat sera initialisé à null.
     *
     * @param ville       La ville de l'adresse.
     * @param codePostal  Le code postal de l'adresse.
     */
    public Adresse(String ville, int codePostal) {
        this(null, ville, codePostal); // Appel du constructeur complet avec gouvernorat = null
    }

    // Getters et setters

    public String getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "gouvernorat='" + gouvernorat + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal=" + codePostal +
                '}';
    }
}