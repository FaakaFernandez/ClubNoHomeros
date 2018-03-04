package ar.edu.unlam.pb2.homerobar;

import java.util.TreeSet;

public class Bar {

	private Boolean abierto;
	private TreeSet<Persona> persona;

	public Bar() {
		this.persona = new TreeSet<Persona>();
		this.abierto = false;
	}

	public Bar(CompareToEdad comparator) {
		this.persona = new TreeSet<Persona>();
		this.abierto = false;
	}

	public TreeSet<Persona> getPersona() {
		return persona;
	}

	public void entraCliente(Persona persona) {
		this.persona.add(persona);
	}

	public void abrirBar() {
		this.abierto = true;
	}

	public Boolean elBarEstaAbierto() {
		return abierto;
	}

}
