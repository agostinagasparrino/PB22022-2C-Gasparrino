package ar.edu.unlam.pb2;

import java.util.*;

public class Alarma {

	private Integer idAlarma;
	private Integer cod_activ_desactiv;
	private Integer cod_config;
	private String nombre;
	private Set<Usuario> usuarios = new HashSet();
	private Set<AccionRealizada> acciones = new HashSet();
	private Map<Integer, Sensor> sensores = new HashMap();

	public Alarma(Integer idAlarma, Integer cod_activ_desactiv, Integer cod_config, String nombre) {
		super();
		this.idAlarma = idAlarma;
		this.cod_activ_desactiv = cod_activ_desactiv;
		this.cod_config = cod_config;
		this.nombre = nombre;
	}

	public Integer getIdAlarma() {
		return idAlarma;
	}

	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}

	public Integer getCod_activ_desactiv() {
		return cod_activ_desactiv;
	}

	public void setCod_activ_desactiv(Integer cod_activ_desactiv) {
		this.cod_activ_desactiv = cod_activ_desactiv;
	}

	public Integer getCod_config() {
		return cod_config;
	}

	public void setCod_config(Integer cod_config) {
		this.cod_config = cod_config;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Set<AccionRealizada> getAcciones() {
		return acciones;
	}

	public void setAcciones(Set<AccionRealizada> acciones) {
		this.acciones = acciones;
	}

	public Map<Integer, Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(Map<Integer, Sensor> sensores) {
		this.sensores = sensores;
	}

	@Override
	public String toString() {
		return "Alarma [idAlarma=" + idAlarma + ", cod_activ_desactiv=" + cod_activ_desactiv + ", cod_config="
				+ cod_config + ", nombre=" + nombre + ", usuarios=" + usuarios + ", acciones=" + acciones
				+ ", sensores=" + sensores + "]";
	}

	public void agregarUsuarioConfigurador(Usuario UsuarioConfigurador) {
		usuarios.add(UsuarioConfigurador);

	}

	public Integer cantidadDeUsuarios() {
		return usuarios.size();
	}

	public void agregarSensor(Sensor sensor) throws SensorDuplicadoException {
          if(sensores.containsKey(sensor)) {
        	  throw new SensorDuplicadoException("Sensor duplicado");
			
		}
		
	}

}
