package controllers;

import views.MenuView;
import controllers.HippodromeController;

public class Main {
	
	public static void main(String[]args) {
		MenuView menu = new MenuView();
		HippodromeController hc = new HippodromeController();
		menu.bonjour();
		while(true) {
			menu.choix();
		}
	}
}

