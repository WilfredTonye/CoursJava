import  java.util.Scanner;
public class Main {
    int x = 82;
    int y = 25;
    // difference entre la methode static et la methode public

    //Static method
      static void methodestatic() {
        System.out.println("Static methods can be called without creating objects");
}
     // Public method
    public void methodepublic(){
        System.out.println("Public methods must be called by creating objects");
    }

    static void Bonjour() {//creation de la methode Bonjour
        System.out.println("Bonjout a tous");
    }

        public static void main(String[] args) {
            System.out.println("Hello world!");
            FirstClass Objet1 = new FirstClass();// creation de l'objet Objet1
            System.out.println(Objet1.x);//affichage de la valeur de la variable x a travers l'objet

            //Les Attributs java
            Main chiffre = new Main();
            System.out.println(chiffre.x);
            //Modification de la valeur
            Main essai1 = new Main();
            essai1.x = 40;
            System.out.println(essai1.x);
            //Remplacement de la valeur
            Main essai2 = new Main();
            essai2.y = 75;
            System.out.println(essai2.y);
            FirstClass pres = new FirstClass();
            System.out.println("Je m'appelle:" + " " + pres.prenom + pres.nom + " " + "je suis agee de:" + " " + pres.age + "ans");
            Bonjour();//appelle de la methode Bonjour
            methodestatic(); // Call the static method
            // myPublicMethod(); This would compile an error

            Main myObj = new Main(); // Create an object of Main
            myObj.methodepublic(); // Call the public method on the object

            Scanner test = new Scanner(System.in);
            System.out.println("Entrez votre Username");
            String Username = test.nextLine();
            System.out.println("Username is:"+" "+Username);
        }
}