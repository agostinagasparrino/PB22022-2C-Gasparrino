package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Central {

	private ArrayList<Alarma> alarmaParaAgregar = new ArrayList<Alarma>();
	private ArrayList<Usuario> usuarioParaAgregar = new ArrayList<Usuario>();

	public void agregarAlarma(Alarma alarmaAgregar) {
		alarmaParaAgregar.add(alarmaAgregar);

	}

	public Integer cantidadDeAlarmas() {
		return alarmaParaAgregar.size();
	}

}
