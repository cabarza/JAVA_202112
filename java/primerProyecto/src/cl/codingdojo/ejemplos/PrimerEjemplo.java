package cl.codingdojo.ejemplos;

/**
 * Esta es mi primera clase de ejemplo
 * @author César Abarza
 * @version 1.0
 *
 */
public class PrimerEjemplo {

	public static void main(String[] args) {
		
		PrimerEjemplo primerEjemplo = new PrimerEjemplo();
		primerEjemplo.setMensaje("Mensaje Primer Ejemplo");
		
		System.out.println(primerEjemplo.toString() + " " + primerEjemplo.getMensaje());
		
		
		PrimerEjemplo instancia2 = new PrimerEjemplo();
		instancia2.setMensaje("Este mensaje corresponde a la Instancia 2");
		System.out.println(instancia2 + " " + instancia2.getMensaje());
		
		
		String miNombre = "César Abarza";
		miNombre += " Suazo";
		System.out.println(miNombre);
		
		System.out.println("Otro mensaje");
	}
	
	// Atributo de mi clase
	private String mensaje;
	
	/**
	 * Método encargado de obtener el mensaje (GETTER)
	 * @return retorna el valor del mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	
	/**
	 * Método encargado de asignar valor a mensaje (SETTER)
	 * @param mensaje representa el nuevo valor que tendrá el mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
