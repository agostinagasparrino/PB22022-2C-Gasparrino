package ar.edu.unlam.pb2;

import java.util.*;

public class AccionRealizada {

	private Integer idAccion;
	private Set<Alarma> alarmas = new HashSet();
	private Set<Usuario> usuarios = new HashSet();
	private Integer fecha;
	private TipoDeOperacion tipoDeOperacion;
	public AccionRealizada(Integer idAccion, Set<Alarma> alarmas, Set<Usuario> usuarios, Integer fecha,
			TipoDeOperacion tipoDeOperacion) {
		super();
		this.idAccion = idAccion;
		this.alarmas = alarmas;
		this.usuarios = usuarios;
		this.fecha = fecha;
		this.tipoDeOperacion = tipoDeOperacion;
	}
	public Integer getIdAccion() {
		return idAccion;
	}
	public void setIdAccion(Integer idAccion) {
		this.idAccion = idAccion;
	}
	public Set<Alarma> getAlarmas() {
		return alarmas;
	}
	public void setAlarmas(Set<Alarma> alarmas) {
		this.alarmas = alarmas;
	}
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Integer getFecha() {
		return fecha;
	}
	public void setFecha(Integer fecha) {
		this.fecha = fecha;
	}
	public TipoDeOperacion getTipoDeOperacion() {
		return tipoDeOperacion;
	}
	public void setTipoDeOperacion(TipoDeOperacion tipoDeOperacion) {
		this.tipoDeOperacion = tipoDeOperacion;
	}
	@Override
	public String toString() {
		return "AccionRealizada [idAccion=" + idAccion + ", alarmas=" + alarmas + ", usuarios=" + usuarios + ", fecha="
				+ fecha + ", tipoDeOperacion=" + tipoDeOperacion + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(alarmas, fecha, idAccion, tipoDeOperacion, usuarios);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccionRealizada other = (AccionRealizada) obj;
		return Objects.equals(alarmas, other.alarmas) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(idAccion, other.idAccion) && tipoDeOperacion == other.tipoDeOperacion
				&& Objects.equals(usuarios, other.usuarios);
	}
	
	

}
