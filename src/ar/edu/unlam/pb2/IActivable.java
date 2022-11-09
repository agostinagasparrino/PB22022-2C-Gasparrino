package ar.edu.unlam.pb2;

public interface IActivable {

	public abstract boolean agregarAlarma(Alarma alarma);

	public abstract boolean agregarUsuario(Usuario usuario);

	public abstract void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer idAlarma,
			String codigoConfiguracionAlarma);
	
	public abstract boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor, Integer idUsuarioConfigurador);

	public abstract boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, String codigoActivacionAlarma);
	
	public abstract boolean activarDesactivarAlarma(Integer idAlarma, String codigoActivacionAlarma, UsuarioConfigurador usuario);
}
