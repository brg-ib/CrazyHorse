package views;

import utils.Utilitaire;

public class MenuView {


    public MenuView() {

    }

    public void bonjour() {
        System.out.println("ðŸ�‡ðŸ�‡ Bienvenue au Crazy Horse ðŸ�‡ðŸ�‡");
    }

    
    String festivalName;
    String sceneName;

    public void choix() {
        System.out.println("Quel action souhaitez-vous faire ?");
        System.out.println("0 Les 10 dernieres courses ðŸ�†");
        System.out.println("1 CrÃ©er une course");
        System.out.println("2 CrÃ©er un cheval ðŸ�Ž");
        System.out.println("3 Afficher les courses");
        System.out.println("4 Afficher les chevaux");
        System.out.println("5 Modifier une course");
        System.out.println("6 Modifier un cheval");
        System.out.println("7 Ajouter un cheval Ã  une course");
        System.out.println("8 Ajouter une course Ã  l'hippodrome ðŸ�Ÿ");
        System.out.println("9 Enlever une course d'un hippodrome");
        System.out.println("10 Enlever un cheval d'une course");
        System.out.println("11 Supprimer une course");
        System.out.println("12 Supprimer un cheval");
        switch (Utilitaire.saisieString()) {
        case "0":
			System.out.println("0 Les 10 dernieres courses ðŸ��");
			break;
		case "1":
			System.out.println("1 CrÃ©er une course");
			System.out.println("Saisissez un nom de c : ");
			festivalName = Utilitaire.saisieString();
			System.out.println("Saisissez une ann�e au festival : ");
			int festivalYear = Integer.parseInt(Utilitaire.saisieString());
			courseController.createCourse(festivalName,festivalYear);
			break;
		case "2":
			festivalController.printFestivals();
		case "3":
			System.out.println("3 Ajouter une scene � un festival");
			System.out.println("Saisissez un nom de festival : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			System.out.println("Saisissez un nom pour la sc�ne : ");
			sceneName = Utilitaire.saisieString();
			if(festivalController.createSceneAndAddToFestival(festivalName, sceneName))
				System.out.println("L'ajout a r�ussi");
			else
				System.out.println("L'ajout a �chou�");
			break;
		case "4":
			System.out.println("4 Enlever une sc�ne d'un festival");
			System.out.println("Saisissez un nom du festival � selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			if(!festivalController.printAllScenesNameByFestivalName(festivalName)) {
				System.out.println("Erreur dans la r�cup�ration des sc�nes, veuillez recommencer le processus.");
			}else {
				System.out.println("Saisissez un nom pour la sc�ne : ");
				sceneName = Utilitaire.saisieString();
				if(festivalController.deleteSceneFromFestival(festivalName, sceneName))
					System.out.println("La suppression a r�ussi");
				else
					System.out.println("La suppression a �chou�");
			}
			break;
		case "5":
			System.out.println("6 Modifier le nom du festival");
			System.out.println("Saisissez un nom du festival � selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			System.out.println("Saisissez le nouveau nom du festival : ");
			String newFestivalName = Utilitaire.saisieString();
				if(festivalController.deleteFestivalByName(festivalName))
					System.out.println("La suppression a r�ussi");
				else
					System.out.println("La suppression a �chou�");
			break;
			
		case "6":
			System.out.println("5 Enlever un festival");
			System.out.println("Saisissez un nom du festival � selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
				if(festivalController.deleteFestivalByName(festivalName))
					System.out.println("La suppression a r�ussi");
				else
					System.out.println("La suppression a �chou�");
			break;
		case "7":
			System.out.println("7 Ajouter groupe � scene");
			System.out.println("Saisissez un nom du festival � selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			//Festival festival = festivalController.getFestivalByName(festivalName);
			System.out.println("Saisissez un nom de sc�ne : ");
			festivalController.printAllScenesNameByFestivalName(festivalName);
			sceneName = Utilitaire.saisieString();
			System.out.println("Saisissez un nom de groupe � ajouter : ");
			String groupeName = Utilitaire.saisieString();
			if(sceneController.createGroupeAndAddToScene(festivalName, sceneName, groupeName))
				System.out.println("L'ajout a r�ussi");
			else
				System.out.println("L'ajout a �chou�");
			break;
		case "8":
			System.out.println("8 Sup groupe � scene");
			System.out.println("Saisissez un nom du festival � selectionner : ");
			festivalController.printFestivals();
			festivalName = Utilitaire.saisieString();
			//Festival festival = festivalController.getFestivalByName(festivalName);
			System.out.println("Saisissez un nom de sc�ne : ");
			festivalController.printAllScenesNameByFestivalName(festivalName);
			sceneName = Utilitaire.saisieString();
			System.out.println("Saisissez le nom du groupe � sup : ");
			groupeName = Utilitaire.saisieString();
			if(sceneController.supGroupeFromScene(festivalName, sceneName, groupeName))
				System.out.println("La sup a r�ussi");
			else
				System.out.println("La sup a �chou�");
			break;
		
		default:
			break;
		}
    }
}
