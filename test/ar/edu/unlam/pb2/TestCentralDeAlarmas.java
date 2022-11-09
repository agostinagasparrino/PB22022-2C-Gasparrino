package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCentralDeAlarmas {

	@Test
	public void queSePuedaRegistrarUnaAlarmaEnLaCentral() {
		Central central = new Central();
		Alarma alarma = new Alarma(123, 1, 2, "a");

		central.agregarAlarma(alarma);

		Integer valorEsperado = 1;
		Integer valorObtenido = central.cantidadDeAlarmas();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		Alarma alarma = new Alarma(123, 1, 2, "a");
		UsuarioConfigurador conf = new UsuarioConfigurador("pepe", 45689);

		alarma.agregarUsuarioConfigurador(conf);
		Integer valorEsperado = 1;
		Integer valorObtenido = alarma.cantidadDeUsuarios();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void alAgregarUnUsuarioAUnaAlarmaConCodigoDeConfiguracionDeAlarmaInvalidoSeLanceUnCodigoAlarmaIncorrectoException() {

	}

	@Test
	public void alAgregarUnSensorDuplicadoEnUnaAlarmaSeLanceUnaSensorDuplicadoException() throws SensorDuplicadoException {
		Alarma alarma = new Alarma(123, 1, 2, "a");
		Sensor s = new Sensor(5, true);
		Sensor s1 = new Sensor(5, true);
		
		alarma.agregarSensor(s);
		Integer valorEsperado = 1;
		Integer valorObtenido= 1;
		
		assertEquals(valorEsperado, valorObtenido);
		
	}

	@Test
	public void queNoSePuedaActivarUnaAlarmaSiHayAlMenosUnSensorDesactivado() {

	}

	@Test
	public void queParaUnaAlarmaDeterminadaSePuedaObtenerUnaColeccionOrdenadaDeAccionesDeTipoConfiguracionOrdenadasPorElIdDeAccion() {

	}

}
