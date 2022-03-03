package views;


import controllers.CourseController;
import controllers.HippodromeController;
import utils.Utilitaire;
import models.*;

public class MenuView {

    HippodromeController hippodromeController;
    CourseController courseController;

    String hippodromeName;
    String CourseName;

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
        System.out.println("1 Créer un hippodrome");
        System.out.println("2 Afficher l'hippodrome");
        System.out.println("3 Modifier l'hippodrome");
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
            case "0" :
                System.out.println("0 Les 10 dernieres courses");
                break;
            case "1":
                System.out.println("1 Créer un hippodrome");
                if( Data.getHippodromes() != null ) {
                    System.out.println("Saisissez le nom de l'hippodrome : ");
                    hippodromeName = Utilitaire.saisieString();
                    hippodromeController.createHippodrome(hippodromeName);
                    System.out.println("Opération effectuée !");
                }
                else {
                    System.out.println("Un hippodrome existe déjà !");
                }
                break;
            case "2":
                hippodromeController.printHippodrome();
                break;
            case "3":
                System.out.println("3 Modifier le nom de l'hippodrome");
                if(Data.getHippodromes() != null ) {
                    System.out.println("Saisissez le nouveau nom de l'hippodrome : ");
                    String newHippodromeName = Utilitaire.saisieString();
                    //hippodromeController.setName(newHippodromeName);
                }
                else
                    System.out.println("Aucun hippodrome trouvé !");
                break;
            case "30":
                System.out.println("3 Ajouter une scene à un festival");
                System.out.println("Saisissez un nom de festival : ");
                hippodromeController.printHippodrome();
                hippodromeName = Utilitaire.saisieString();
                System.out.println("Saisissez un nom pour la scène : ");
                CourseName = Utilitaire.saisieString();
                if(hippodromeController.createCourseAndAddToHippodrome(hippodromeName, CourseName))
                    System.out.println("L'ajout a réussi");
                else
                    System.out.println("L'ajout a échoué");
                break;
            case "4":
                System.out.println("4 Enlever une scène d'un festival");
                System.out.println("Saisissez un nom du festival à selectionner : ");
                hippodromeController.printHippodrome();
                hippodromeName = Utilitaire.saisieString();
                if(!hippodromeController.printAllCourseNameByHippodromeName(hippodromeName)) {
                    System.out.println("Erreur dans la récupération des scènes, veuillez recommencer le processus.");
                }else {
                    System.out.println("Saisissez un nom pour la scène : ");
                    CourseName = Utilitaire.saisieString();
                    if(hippodromeController.deleteCourseFromHippodrome(hippodromeName, CourseName))
                        System.out.println("La suppression a réussi");
                    else
                        System.out.println("La suppression a échoué");
                }
                break;
            case "5":
                System.out.println("6 Modifier le nom du festival");
                System.out.println("Saisissez un nom du festival à selectionner : ");
                hippodromeController.printHippodrome();
                hippodromeName = Utilitaire.saisieString();
                System.out.println("Saisissez le nouveau nom du festival : ");
                String newFestivalName = Utilitaire.saisieString();
                if(hippodromeController.deleteHippodromeByName(hippodromeName))
                    System.out.println("La suppression a réussi");
                else
                    System.out.println("La suppression a échoué");
                break;
            case "6":
                System.out.println("5 Enlever un festival");
                System.out.println("Saisissez un nom du festival à selectionner : ");
                hippodromeController.printHippodrome();
                hippodromeName = Utilitaire.saisieString();
                if(hippodromeController.deleteHippodromeByName(hippodromeName))
                    System.out.println("La suppression a réussi");
                else
                    System.out.println("La suppression a échoué");
                break;
            case "7":
                System.out.println("7 Ajouter groupe à scene");
                System.out.println("Saisissez un nom du festival à selectionner : ");
                hippodromeController.printHippodrome();
                hippodromeName = Utilitaire.saisieString();
                //Festival festival = festivalController.getFestivalByName(festivalName);
                System.out.println("Saisissez un nom de scène : ");
                hippodromeController.printAllCourseNameByHippodromeName(hippodromeName);
                CourseName = Utilitaire.saisieString();
                System.out.println("Saisissez un nom de groupe à ajouter : ");
                String chevalName = Utilitaire.saisieString();
                if(courseController.createChevalAndAddToCourse(hippodromeName, CourseName, chevalName))
                    System.out.println("L'ajout a réussi");
                else
                    System.out.println("L'ajout a échoué");
                break;
            case "8":
                System.out.println("8 Sup groupe à scene");
                System.out.println("Saisissez un nom du festival à selectionner : ");
                hippodromeController.printHippodrome();
                hippodromeName = Utilitaire.saisieString();
                //Festival festival = festivalController.getFestivalByName(festivalName);
                System.out.println("Saisissez un nom de scène : ");
                hippodromeController.printAllCourseNameByHippodromeName(hippodromeName);
                CourseName = Utilitaire.saisieString();
                System.out.println("Saisissez le nom du groupe à sup : ");
                chevalName = Utilitaire.saisieString();
                if(courseController.deleteChevalFromCourse(hippodromeName, CourseName, chevalName))
                    System.out.println("La sup a réussi");
                else
                    System.out.println("La sup a échoué");
                break;

            default:
                break;
        }
    }
}
