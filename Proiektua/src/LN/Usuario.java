package LN;

public class Usuario extends Jugador{
	
	String contraseña;

	public Usuario(String nombre, int numJug, String contraseña){
		super(nombre, numJug);
		contraseña = this.contraseña;
	}
}
