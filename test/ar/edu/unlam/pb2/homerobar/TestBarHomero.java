package ar.edu.unlam.pb2.homerobar;

import org.junit.Assert;
import org.junit.Test;

public class TestBarHomero {

	@Test
	public void testQueElBarEstaAbierto() {

		Bar miBar = new Bar();
		miBar.abrirBar();
		Assert.assertTrue(miBar.elBarEstaAbierto().equals(true));
	}

	@Test
	public void testQueAgregaClientesNoDuplicados() {
		Bar miBar = new Bar();
		Persona persona1 = new Persona("Carlos", 24);
		Persona persona2 = new Persona("Carlos", 28);
		Persona persona3 = new Persona("Florencia", 25);
		Persona persona4 = new Persona("Federico", 21);
		Persona persona5 = new Persona("Laura", 22);

		miBar.entraCliente(persona1);
		miBar.entraCliente(persona2);
		miBar.entraCliente(persona3);
		miBar.entraCliente(persona4);
		miBar.entraCliente(persona5);

		System.out.println(" " + miBar.getPersona());
		Assert.assertEquals(4, miBar.getPersona().size());

	}

	@Test
	public void testQueOrdenaElNombreAlfabeticamente() {
		Bar miBar = new Bar();

		Persona persona1 = new Persona("Julian", 24);
		Persona persona2 = new Persona("Abel", 21);
		Persona persona3 = new Persona("Nicolas", 22);

		miBar.entraCliente(persona1);
		miBar.entraCliente(persona2);
		miBar.entraCliente(persona3);

		System.out.println(" " + miBar.getPersona());

		String nombreEsperado = "Abel";
		Assert.assertEquals(nombreEsperado, miBar.getPersona().first().getNombre());

	}

}
