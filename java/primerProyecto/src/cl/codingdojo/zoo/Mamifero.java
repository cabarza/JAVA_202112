package cl.codingdojo.zoo;

public abstract class Mamifero {
	
	private int energia;
	
	public Mamifero() {
		this.energia = 100;
	}
	
	public int displayEnergy() {
		System.out.println("La energía es de: " + energia);
		return this.energia;
	}

	public abstract void caminar();
	
	
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

}
