package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {

		int velocidad = 90; // Km/h
		int limiteVelocidad = 80;

		// IF Anidado - IF ELSE IF

		boolean carretera = true;

		if (carretera) {
			// Block code
			System.out.println("Carretera");

			limiteVelocidad = 110; // Km/h

			if (velocidad > limiteVelocidad) {	
				System.out.println("El coche va a exceso de velocidad, multa!!");
			} else {
				System.out.println("El coche va en la velocidad adecuada, felicidades!");
			}

		} else if (velocidad > limiteVelocidad) {
			System.out.println("Calle");
			System.out.println("El coche va a exceso de velocidad, multa!!");
		} else {
			System.out.println("El coche va en la velocidad adecuada, felicidades!");
		}
		
	}

}
