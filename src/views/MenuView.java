package views;

import utils.Utilitaire;

public class MenuView {


    public MenuView() {

    }

    public void bonjour() {
        System.out.println("Ã°Å¸ï¿½â€¡Ã°Å¸ï¿½â€¡ Bienvenue au Crazy Horse Ã°Å¸ï¿½â€¡Ã°Å¸ï¿½â€¡");
    }

    
    String festivalName;
    String sceneName;

    public void choix() {
        System.out.println("Quel action souhaitez-vous faire ?");
        System.out.println("0 Les 10 dernieres courses Ã°Å¸ï¿½â€ ");
        System.out.println("1 CrÃƒÂ©er une course");
        System.out.println("2 CrÃƒÂ©er un cheval Ã°Å¸ï¿½Å½");
        System.out.println("3 Afficher les courses");
        System.out.println("4 Afficher les chevaux");
        System.out.println("5 Modifier une course");
        System.out.println("6 Modifier un cheval");
        System.out.println("7 Ajouter un cheval ÃƒÂ  une course");
        System.out.println("8 Ajouter une course ÃƒÂ  l'hippodrome Ã°Å¸ï¿½Å¸");
        System.out.println("9 Enlever une course d'un hippodrome");
        System.out.println("10 Enlever un cheval d'une course");
        System.out.println("11 Supprimer une course");
        System.out.println("12 Supprimer un cheval");
        switch (Utilitaire.saisieString()) {
        case "0":
			System.out.println("0 Les 10 dernieres courses Ã°Å¸ï¿½â€");
			break;
		case "1":
			System.out.println("1 CrÃƒÂ©er une course");
			System.out.println("Saisissez un nom de c : ");
			festivalName = Utilitaire.saisieString();
			System.out.println("Saisissez une année au festival : ");
			int festivalYear = Integer.parseInt(Utilitaire.saisieString());
			courseController.createCourse(festivalName,festivalYear);
			break;
		case "2":
			festivalController.printFestivals();
		case "3":
			System.out.println("3 Ajouter une scene à un festival");
			System.out.println("Saisissez un nom de festival : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			System.out.println("Saisissez un nom pour la scène : ");
			sceneName = Utilitaire.saisieString();
			if(festivalController.createSceneAndAddToFestival(festivalName, sceneName))
				System.out.println("L'ajout a réussi");
			else
				System.out.println("L'ajout a échoué");
			break;
		case "4":
			System.out.println("4 Enlever une scène d'un festival");
			System.out.println("Saisissez un nom du festival à selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			if(!festivalController.printAllScenesNameByFestivalName(festivalName)) {
				System.out.println("Erreur dans la récupération des scènes, veuillez recommencer le processus.");
			}else {
				System.out.println("Saisissez un nom pour la scène : ");
				sceneName = Utilitaire.saisieString();
				if(festivalController.deleteSceneFromFestival(festivalName, sceneName))
					System.out.println("La suppression a réussi");
				else
					System.out.println("La suppression a échoué");
			}
			break;
		case "5":
			System.out.println("6 Modifier le nom du festival");
			System.out.println("Saisissez un nom du festival à selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			System.out.println("Saisissez le nouveau nom du festival : ");
			String newFestivalName = Utilitaire.saisieString();
				if(festivalController.deleteFestivalByName(festivalName))
					System.out.println("La suppression a réussi");
				else
					System.out.println("La suppression a échoué");
			break;
			
		case "6":
			System.out.println("5 Enlever un festival");
			System.out.println("Saisissez un nom du festival à selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
				if(festivalController.deleteFestivalByName(festivalName))
					System.out.println("La suppression a réussi");
				else
					System.out.println("La suppression a échoué");
			break;
		case "7":
			System.out.println("7 Ajouter groupe à scene");
			System.out.println("Saisissez un nom du festival à selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			//Festival festival = festivalController.getFestivalByName(festivalName);
			System.out.println("Saisissez un nom de scène : ");
			festivalController.printAllScenesNameByFestivalName(festivalName);
			sceneName = Utilitaire.saisieString();
			System.out.println("Saisissez un nom de groupe à ajouter : ");
			String groupeName = Utilitaire.saisieString();
			if(sceneController.createGroupeAndAddToScene(festivalName, sceneName, groupeName))
				System.out.println("L'ajout a réussi");
			else
				System.out.println("L'ajout a échoué");
			break;
		case "8":
			System.out.println("8 Sup groupe à scene");
			System.out.println("Saisissez un nom du festival à selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			//Festival festival = festivalController.getFestivalByName(festivalName);
			System.out.println("Saisissez un nom de scène : ");
			festivalController.printAllScenesNameByFestivalName(festivalName);
			sceneName = Utilitaire.saisieString();
			System.out.println("Saisissez le nom du groupe à sup : ");
			groupeName = Utilitaire.saisieString();
			if(sceneController.supGroupeFromScene(festivalName, sceneName, groupeName))
				System.out.println("La sup a réussi");
			else
				System.out.println("La sup a échoué");
			break;
		
		default:
			break;
		}
    }
}
