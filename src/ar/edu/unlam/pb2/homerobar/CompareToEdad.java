package ar.edu.unlam.pb2.homerobar;

import java.util.Comparator;

public class CompareToEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		return persona1.getEdad() - persona2.getEdad();
	}

}
