public class Test {
    public static void main(String[] args) {
        // Créer une adresse avec le constructeur complet
        Adresse adresse1 = new Adresse("QUEBEC", "VILLE DE QUEBEC", 2080);
        System.out.println("Adresse 1 : " + adresse1);

        // Modifier le code postal
        adresse1.setCodePostal(2081);
        System.out.println("Adresse 1 modifiée : " + adresse1);

        // Créer une adresse avec le constructeur partiel
        Adresse adresse2 = new Adresse("MONTREAL", 1000);
        System.out.println("Adresse 2 : " + adresse2);

        // Modifier la ville
        adresse2.setVille("MONTREAL");
        System.out.println("Adresse 2 modifiée : " + adresse2);

        // Créer un chercheur avec le constructeur complet
        Chercheur chercheur1 = new Chercheur("John Doe", "Professeur", 123);
        System.out.println("Chercheur 1 : " + chercheur1);

        // Créer un chercheur avec le constructeur par défaut
        Chercheur chercheur2 = new Chercheur();
        chercheur2.setNom("Jane Smith");
        chercheur2.setPoste("Assistante");
        chercheur2.setNumOrdinateur(456);
        System.out.println("Chercheur 2 : " + chercheur2);

        System.out.println("Nombre de chercheurs créés : " + Chercheur.getCompteur());

        // Comparer deux chercheurs
        chercheur1.comparer(chercheur2);

        // Modifier le numéro de l'ordinateur de chercheur1
        chercheur1.setNumOrdinateur(789);

        // Créer un chercheur avec le constructeur par défaut
        Chercheur chercheur3 = new Chercheur();
        chercheur3.setNom("Bob Johnson");
        chercheur3.setPoste("Doctorant");
        chercheur3.setNumOrdinateur(101);

        // Créer deux bureaux avec 3 chercheurs chacun
        Bureau bureau1 = new Bureau("Bureau 1", "B101", new Chercheur[]{chercheur1, chercheur2, chercheur3});
        Bureau bureau2 = new Bureau("Bureau 2", "B102", new Chercheur[]{
                new Chercheur("Alice Brown", "Professeure", 202),
                new Chercheur("Tom Wilson", "Doctorant", 203),
                new Chercheur("Emily Davis", "Assistante", 204)
        });

        // Créer un laboratoire avec deux bureaux
        Laboratoire laboratoire1 = new Laboratoire("Laboratoire d'Informatique", "Informatique", adresse1, new Bureau[]{bureau1, bureau2});

        // Afficher les caractéristiques du laboratoire
        System.out.println(laboratoire1);
    }
}