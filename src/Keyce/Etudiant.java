package Keyce;

public class Etudiant {
    private int Id_Etudiant;
    private String nom;
    private String prenom;
    private int age;

    public int getId_Etudiant() {//creation des Getters
        return Id_Etudiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setId_Etudiant(int id_Etudiant) {//creation des Setters
        Id_Etudiant = id_Etudiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Etudiant(int id_Etudiant, String nom, String prenom, int age) {//creation du constructeur
        Id_Etudiant = id_Etudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
}
