package de.bbq;

import java.util.Scanner;

public class App {
	static int zufallszahl;
	static int gerateneZahl;
	static int maxZahl;
	static int count = 0;
	
	public static void spielStart() {
		System.out.print("Bitte geben Sie eine maximale Zahl ein: ");
		Scanner sc = new Scanner(System.in);
		maxZahl = sc.nextInt();
		zufallszahl = (int) (Math.random() * maxZahl);
		System.out.println("Die zufallszahl lautet: " + zufallszahl);
		zahlenEingabe();
	}
	
	public static void zahlenEingabe() {
		System.out.print("Welche Zahl raten Sie? ");
		Scanner sc = new Scanner(System.in);
				
		if (sc.hasNextInt()) {
			gerateneZahl = sc.nextInt();
			if (gerateneZahl > maxZahl) {
				System.out.println("Bitte geben Sie eine Zahl zwischen 0 und " + maxZahl + " ein");
				zahlenEingabe();
				} else if (gerateneZahl < 0) {
					System.out.println("Bitte geben Sie eine Zahl zwischen 0 und " + maxZahl + " ein");
					zahlenEingabe();
				} else {
					count++;
					System.out.println("Anzahl Versuche: " + count);
					System.out.println("Die geratene zahl lautet: " + gerateneZahl);
					zahlenVergleich();
				}
			} else {
				System.out.println("Bitte geben Sie eine Zahl zwischen 0 und " + maxZahl + " ein");
				zahlenEingabe();
		}
		zahlenVergleich();
	}
	
	public static void zahlenVergleich() {
		if (zufallszahl == gerateneZahl) {
			System.out.println("Richtig!");
			System.out.print("Noch mal spielen? Wenn ja, tippe 1 (und Enter) sonst eine andere Zahl: ");
			
			
			Scanner scNochmalSpielen = new Scanner(System.in);
			int nochmalSpielen = scNochmalSpielen.nextInt();
			if (scNochmalSpielen.hasNextInt()) {
				if (nochmalSpielen == 1) {
					spielStart();
				} else {
					System.out.println("Tschüss! Bis zum nächsten Mal :-)");
				}
			
			}  else {
				zahlenVergleich();				
			}
		}
	}
	
	public static void main(String[] args) {
		spielStart();		
		
	}

}
