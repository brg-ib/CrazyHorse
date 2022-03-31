package views;


import controllers.CourseController;
import controllers.HippodromeController;
import utils.Utilitaire;
import models.*;

public class MenuView {

    HippodromeController hippodromeController;
    CourseController courseController;

    String hippodromeName;
    String courseName;

    public MenuView() {
        hippodromeController = new HippodromeController();
        courseController = new CourseController();
    }

    public void bonjour() {
        System.out.println("====== Bienvenue au Crazy Horse ======");
    }

    public void choix() {
        System.out.println("Quelle action souhaitez-vous faire ?");
        System.out.println("======================");
        System.out.println("0 Les 10 dernieres courses");
        System.out.println("======================");
        //System.out.println("1 Créer un hippodrome");
        System.out.println("2 Afficher l'hippodrome");
        //System.out.println("3 Modifier l'hippodrome");
        System.out.println("======================");
        System.out.println("4 Créer une course");
        System.out.println("5 Afficher les courses");
        System.out.println("6 Modifier une course");
        System.out.println("7 Supprimer une course");
        System.out.println("======================");
        System.out.println("8 Créer un cheval");
        System.out.println("9 Afficher les chevaux");
        System.out.println("10 Modifier un cheval");
        System.out.println("11 Supprimer un cheval");
        System.out.println("======================");
        System.out.println("12 Ajouter un cheval à une course");
        System.out.println("13 Ajouter une course à l'hippodrome");
        System.out.println("14 Enlever une course d'un hippodrome");
        System.out.println("15 Enlever un cheval d'une course");
        System.out.println("======================");
        System.out.print("Votre choix ? ");

        switch (Utilitaire.saisieString()) {
            case "0":
                System.out.println("0 Les 10 dernieres courses");
                break;
            case "1":
                System.out.println("1 Créer un hippodrome");
                if (Data.getHippodrome() != null) {
                    System.out.print("Saisissez le nom de l'hippodrome : ");
                    hippodromeName = Utilitaire.saisieString();
                    hippodromeController.setHippodromeName(hippodromeName);
                    System.out.println("Opération effectuée !");
                } else {
                    System.out.println("Un hippodrome existe déjà !");
                }
                break;
            case "2":
                System.out.print("Hippodrome: ");
                hippodromeController.getHippodromeName();
                break;
            case "3":
                System.out.println("3 Modifier le nom de l'hippodrome");
                if (Data.getHippodrome() != null) {
                    System.out.print("Saisissez le nouveau nom de l'hippodrome : ");
                    String newHippodromeName = Utilitaire.saisieString();
                    //hippodromeController.setName(newHippodromeName);
                } else
                    System.out.println("Aucun hippodrome trouvé !");
                break;

            case "4":
                System.out.println("4 Créer une course");
                if (Data.getHippodrome() != null) {
                    System.out.print("Saisissez le nom de la course : ");
                    courseName = Utilitaire.saisieString();
                    courseController.createCourse(courseName);
                    System.out.println("Opération effectuée !");
                } else {
                    System.out.println("Cette course existe déjà !");
                }
                break;
            case "5":
                System.out.println("2 Afficher les courses");
                if (Data.getHippodrome().courses != null)
                    Data.getHippodrome();
                else
                    System.out.println("Pas de courses !");
                break;


        }

    }

}