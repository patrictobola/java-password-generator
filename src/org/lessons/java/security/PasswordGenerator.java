package org.lessons.java.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
//		Creo delle variabili
		String name = "Patric";
		String lastName = "Tobola";
		String birth = "08/17/1992";
		String color = "Giallo";
		
//		Scompongo la data di nascita e la sommo
		String[] birthValues = birth.split("/");
		int month = Integer.parseInt(birthValues[0]);
		int day = Integer.parseInt(birthValues[1]);
		int year = Integer.parseInt(birthValues[2]);
		
		int sum = month + day + year;
		
//		Per pulizia di codice salvo la psw in una variabile e dopo faccio il syso della psw
		String psw = name + "-" + lastName + "-" + color + "-" + sum;
		
//		Stampo a video la psw generata
		System.out.println("La tua psw è: " + psw);

	}

}
