package br.com.barzor.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.barzor.model.Restaurante;

public class BarzorData {
	
	public static Map<String,Restaurante> dataById;
	public static Map<String,Restaurante> dataByName;
	
	static{
		dataById = new HashMap<String,Restaurante>();
		dataByName = new HashMap<String,Restaurante>();
		
		Restaurante r = new Restaurante();
		r.setId("1");
		r.setNome("Poisonous Den");
		
		dataByName.put(r.getNome(),r);
		dataById.put(r.getId(), r);
		
		
		r = new Restaurante();
		r.setId("2");
		r.setNome("Rat's Nest");
		
		dataByName.put(r.getNome(),r);
		dataById.put(r.getId(), r);
		
		r = new Restaurante();
		r.setId("3");
		r.setNome("Bar Bruto");
		
		dataByName.put(r.getNome(),r);
		dataById.put(r.getId(), r);
	}

}
