package cl.codingdojo.proyecto;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
	
	private List<Project> projects;
	
	public Portfolio() {
		this.projects = new ArrayList<Project>();
	}
	
	
	public double getPortfolioCost() {
		double cost = 0d;
		if(projects != null && !projects.isEmpty()) {
			for(Project p: this.projects) {
				cost += p.getInitialCost();
			}
		}
		return cost;
	}
	
	public void showPortfolio() {
		if(this.projects != null && !this.projects.isEmpty()) {
			for(Project p: this.projects) {
				System.out.println(p.elevatorPitch());
			}
		}
		System.out.println("Protfolio total cost: " + this.getPortfolioCost());
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	

}
