public class Etudiant {
    int Id_Etudiant;
    String nom;
    String prenom;
    int age;

    public Etudiant(int id_Etudiant, String nom, String prenom, int age) {//creation du constructeur
        Id_Etudiant = id_Etudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
}
