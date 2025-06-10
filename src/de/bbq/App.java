package de.bbq;

import java.util.Scanner;

public class App {
	static int zufallszahl;
	static int gerateneZahl;
	
	public static void spielStart() {
		zufallszahl = (int) (Math.random() * 10);
		System.out.println("Ich habe eine Zahl zwischen 0 und 10 ausgedacht. Rate sie!" + zufallszahl);
		zahlenEingabe();
	}
	
	public static void zahlenEingabe() {
		System.out.print("Geben Sie die Zahl ein: ");
		Scanner sc = new Scanner(System.in);
		gerateneZahl = sc.nextInt();
		System.out.println("Die geratene zahl lautet: " + gerateneZahl);
		zahlenVergleich();
	}
	
	public static void zahlenVergleich() {
		if (zufallszahl == gerateneZahl) {
			System.out.println("Richtig!");
			System.out.print("Noch mal spielen? Wenn ja, tippe 1 (und Enter) sonst eine andere Zahl: ");
			
			
			Scanner sc = new Scanner(System.in);
			int nochmalSpielen = sc.nextInt();
			if (nochmalSpielen == 1) {
				spielStart();
			} else {
				System.out.println("Tschüss! Bis zum nächsten Mal :-)");
			}
			
		} else {
			System.out.println("Falsch! Versuchen Sie es nochmal!");
			zahlenEingabe();
		}
	}

	public static void main(String[] args) {
		spielStart();		
		
	}

}
