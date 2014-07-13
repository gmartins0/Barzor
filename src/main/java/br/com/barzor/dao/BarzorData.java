package br.com.barzor.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.barzor.model.Restaurante;

public class BarzorData {
	
	public static Map<String,Restaurante> dataById;
	public static Map<String,Restaurante> dataByNome;
	
	static{
		dataById = new HashMap<String,Restaurante>();
		dataByNome = new HashMap<String,Restaurante>();
		
		Restaurante r = new Restaurante();
		r.setId("1");
		r.setNome("Poisonous Den");
		
		dataByNome.put(r.getNome(),r);
		dataById.put(r.getId(), r);
		
		
		r = new Restaurante();
		r.setId("2");
		r.setNome("Rat's Nest");
		
		dataByNome.put(r.getNome(),r);
		dataById.put(r.getId(), r);
		
		r = new Restaurante();
		r.setId("3");
		r.setNome("Bar Bruto");
		
		dataByNome.put(r.getNome(),r);
		dataById.put(r.getId(), r);
	}

}
