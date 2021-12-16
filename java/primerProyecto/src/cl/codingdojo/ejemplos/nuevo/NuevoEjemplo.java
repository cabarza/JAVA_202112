package cl.codingdojo.ejemplos.nuevo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cl.codingdojo.ejemplos.PrimerEjemplo;
import cl.codingdojo.ejemplos.SegundoEjemplo;

public class NuevoEjemplo {
	public static void main(String[] args) {
		PrimerEjemplo o = new PrimerEjemplo();
		
		o.setMensaje("Utilizando en otra clase y package " + new Date());
		
		System.out.println(o.getMensaje());
		
		SegundoEjemplo.main(new String[] {"10212.11"});
		
		
		int[] arreglo = new int[10];
		String test = null;
		try {
			for(int i = 0; i<10; i++) {
				arreglo[i] = i;
			}
			
			test.indexOf("Hola");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<Integer> lista = new ArrayList<Integer>();
		System.out.println(lista.size());

		for(int i = 0; i<10; i++) {
			lista.add(i);
		}

		
		System.out.println(lista.size());
		
		
		Map<String, Object> mapa = new HashMap<String, Object>();
		mapa.put("ValorUno", 1);
		mapa.put("Valor2", "dos");
		mapa.put("Valor3", new Date());
		
		
		for(String key: mapa.keySet()) {
			System.out.println(key + " : " + mapa.get(key));
		}
		
		
		
	}
}
