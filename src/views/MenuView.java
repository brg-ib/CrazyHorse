package views;


public class MenuView {


    public MenuView() {

    }

    public void bonjour() {
        System.out.println("====== Bienvenue au Crazy Horse ======");
    }

    
    String festivalName;
    String sceneName;

    public void choix() {
        System.out.println("Quel action souhaitez-vous faire ?");

        System.out.println("0 Les 10 dernieres courses");

        System.out.println("1 Créer une course");
        System.out.println("2 Créer un cheval");

        System.out.println("3 Afficher les courses");
        System.out.println("4 Afficher les chevaux");

        System.out.println("5 Modifier une course");
        System.out.println("6 Modifier un cheval");

        System.out.println("7 Ajouter un cheval à une course");
        System.out.println("8 Ajouter une course à l'hippodrome");

        System.out.println("9 Enlever une course d'un hippodrome");
        System.out.println("10 Enlever un cheval d'une course");

        System.out.println("11 Supprimer une course");
        System.out.println("12 Supprimer un cheval");
    }
}
