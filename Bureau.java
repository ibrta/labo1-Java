public class Bureau {
    private String nom;
    private String code;
    private Chercheur[] chercheurs;

    /**
     * Constructeur pour initialiser tous les champs.
     *
     * @param nom        Le nom du bureau.
     * @param code       Le code du bureau.
     * @param chercheurs Le tableau de chercheurs associés au bureau.
     */
    public Bureau(String nom, String code, Chercheur[] chercheurs) {
        this.nom = nom;
        this.code = code;
        this.chercheurs = chercheurs;
    }

    // Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Chercheur[] getChercheurs() {
        return chercheurs;
    }

    public void setChercheurs(Chercheur[] chercheurs) {
        this.chercheurs = chercheurs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bureau{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", chercheurs=[");
        if (chercheurs != null) {
            for (Chercheur chercheur : chercheurs) {
                sb.append(chercheur).append(", ");
            }
            if (chercheurs.length > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}
    