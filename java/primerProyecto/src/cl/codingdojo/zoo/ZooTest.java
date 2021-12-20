package cl.codingdojo.zoo;

public class ZooTest {

	public static void main(String[] args) {
		Gorila manila = new Gorila();
		manila.throwSomething("cáscara de banana");
		manila.throwSomething("piedra");
		manila.throwSomething("manzana");
		
		for(int i = 0; i < 2; i++) {
			manila.eatBananas();
		}
		
		manila.climb();
		
		manila.displayEnergy();
		
		
		IMamifero m1 = new Gorila();
		System.out.println(m1.comer("Plátano"));
		
		IMamifero m2 = new Canguro();
		System.out.println(m2.comer("hojas"));
		
		System.out.println(m1);
		System.out.println(m2);
	}

}
