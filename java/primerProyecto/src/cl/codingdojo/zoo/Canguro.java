package cl.codingdojo.zoo;

public class Canguro extends Mamifero implements IMamifero {

	@Override
	public String comer(String comida) {
		return "El canguro esta comiendo " + comida + " para seguir saltando";
	}

	@Override
	public void caminar() {
		System.out.println("El canguro va saltando");
		
	}
	

}
