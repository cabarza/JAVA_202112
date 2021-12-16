package cl.codingdojo.ejemplos;

public class SegundoEjemplo {
	public static void main(String[] args) {
		
		System.out.println(args);
		
		for(String s: args) {
			System.out.println(s);
		}
		
        double d = Double.parseDouble(args[0]);
        double dd = 35.99;
        try {
	        int suma = 0;
	        for(int i = 0; i < 100; i++) {
	        	suma += 223372036;
	        }
	        System.out.println(suma);
        }catch (Exception e) {
			e.printStackTrace();
		}
        
        //Convirtiendo del valor de double d en un int
        int i = (int)Math.ceil(d);
        
        //Convirtiendo del valor de double dd en un int
        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);
    }
}
