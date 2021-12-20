package cl.codingdojo.clase.oop;

public class Clase2 {

	public static void main(String[] args) {
		Clase1 clase1 = new Clase1("Nombre", 30);
		clase1.setAtt1("Otra cosa");
		
		System.out.println(clase1.toString());
		
		Clase1 nuevaClase1 = new Clase1();
		nuevaClase1.setAtt1("UN VALOR CUALQUIERA");
		System.out.println(nuevaClase1);
		
		System.out.println(nuevaClase1.getAtt1().toLowerCase());
		
		System.out.println(nuevaClase1);
		
	}
	
}
