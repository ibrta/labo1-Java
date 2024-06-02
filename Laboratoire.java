public class Laboratoire {
    private String nom;
    private String specialite;
    private Adresse adresse;
    private Bureau[] bureaux;

    /**
     * Constructeur pour initialiser tous les champs.
     *
     * @param nom        Le nom du laboratoire.
     * @param specialite La spécialité du laboratoire.
     * @param adresse    L'adresse du laboratoire.
     * @param bureaux    Le tableau de bureaux associés au laboratoire.
     */
    public Laboratoire(String nom, String specialite, Adresse adresse, Bureau[] bureaux) {
        this.nom = nom;
        this.specialite = specialite;
        this.adresse = adresse;
        this.bureaux = bureaux;
    }

    // Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Bureau[] getBureaux() {
        return bureaux;
    }

    public void setBureaux(Bureau[] bureaux) {
        this.bureaux = bureaux;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laboratoire{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", specialite='").append(specialite).append('\'');
        sb.append(", adresse=").append(adresse);
        sb.append(", bureaux=[");
        if (bureaux != null) {
            for (Bureau bureau : bureaux) {
                sb.append(bureau).append(", ");
            }
            if (bureaux.length > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }
        }
        sb.append("]}");
        return sb.toString();
    }
}