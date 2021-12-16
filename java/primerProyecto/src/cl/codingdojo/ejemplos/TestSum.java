package cl.codingdojo.ejemplos;

public class TestSum {
	public static void main(String[] args) {
	    long start = System.currentTimeMillis();
	    int sum = 0;
	    for (int i = 0; i < Integer.MAX_VALUE; i++) {
	        sum += i;
	    }
	    System.out.println("Suma: " + sum);
	    long end = System.currentTimeMillis();
	    double total = (double) (end - start) / 1000;
	    System.out.println("Tiempo de ejecucion: " + total + " segundos");
	    
	    
	    StringBuilder sb = new StringBuilder("Inicio");
	    sb.append(10);
	    sb.append("Fin");
	    
	    System.out.println(sb.toString());
	    
	    String s = "Inicio";
	    s += 10;
	    s += "Fin";
	    System.out.println(s);
	    
	    
	    int var1 = 0;
	    Integer var2 = null;
	    
	    System.out.println(var1);
	    System.out.println(var2);
	    
	    PrimerEjemplo ejemplo = new PrimerEjemplo(); 
	    ejemplo.setMensaje("Este es un nuevo ejemplo");
	    System.out.println(ejemplo.getMensaje());
	    
	}
}
