package views;


public class MenuView {


    public MenuView() {

    }

    public void bonjour() {
        System.out.println("Bonjour !");
    }

    String festivalName;

    String sceneName;
    public void choix() {
        System.out.println("Quel action souhaitez-vous faire ?");
        System.out.println("1 Créer un festival");
        System.out.println("2 Afficher les festivals");
        System.out.println("3 Ajouter une scene à un festival");
        System.out.println("4 Enlever une sc�ne d'un festival");
        System.out.println("5 Enlever un festival");
        System.out.println("6 Modifier le nom du festival");
    }
}
