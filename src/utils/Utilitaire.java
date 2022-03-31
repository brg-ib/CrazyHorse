package utils;

import java.util.Random;
import java.util.Scanner;

public class Utilitaire {

	public static String saisieString() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public static int saisieInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static int getRandomNumberInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
