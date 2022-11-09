package ar.edu.unlam.pb2;

public class UsuarioActivador extends Usuario implements IActivable{

	public UsuarioActivador(String nombre, Integer dni) {
		super(nombre, dni);
		
	}
	
	public Boolean activarDesactivarAlarma(Alarma alarma, String cod_activ_desactiv) {
		return null;
	}

	@Override
	public boolean agregarAlarma(Alarma alarma) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean agregarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void agregarUsuarioAUnaAlarma(Integer dniUsuarioAAgregar, Integer idAlarma,
			String codigoConfiguracionAlarma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean agregarSensorAAlarma(Integer idAlarma, String codigoConfiguracionAlarma, Sensor sensor,
			Integer idUsuarioConfigurador) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean activarSensorDeAlarma(Integer idSensor, Integer idAlarma, String codigoActivacionAlarma) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean activarDesactivarAlarma(Integer idAlarma, String codigoActivacionAlarma,
			UsuarioConfigurador usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
