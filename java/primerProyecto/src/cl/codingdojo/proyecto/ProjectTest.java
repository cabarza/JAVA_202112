package cl.codingdojo.proyecto;

public class ProjectTest {

	public static void main(String[] args) {
		Portfolio portfolio = new Portfolio();
		
		Project p1 = new Project("Tarea Proyecto", "Este es eun ejemplo para la tarea de proyectos en Java", 543);
		
		Project p2 = new Project("Tarea Proyecto 2", "Este es eun ejemplo para la tarea de proyectos en Java 2");
		p2.setInitialCost(259);
		
		
		portfolio.getProjects().add(p1);
		portfolio.getProjects().add(p2);
		
		
		portfolio.showPortfolio();

	}

}
