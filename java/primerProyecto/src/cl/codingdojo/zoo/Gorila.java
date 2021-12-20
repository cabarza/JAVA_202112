package cl.codingdojo.zoo;

public class Gorila extends Mamifero implements IMamifero {
	
	public void throwSomething(String objeto) {
		System.out.println("El gorila esta lanzando " + objeto);
		this.setEnergia(this.getEnergia() - 5);
	}
	
	public void eatBananas() {
		System.out.println("El gorila está comiendo bananas");
		this.setEnergia(this.getEnergia() + 10);
	}
	
	public void climb() {
		System.out.println("El gorila ha escalado a la cima");
		this.setEnergia(this.getEnergia() - 10);
	}

	@Override
	public String comer(String comida) {
		return "El gorila esta comiendo " + comida;
	}

	@Override
	public void caminar() {
		System.out.println("El gorila va caminando");
	}
}
