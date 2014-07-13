package br.com.barzor.transaction;

import java.util.Collection;

import br.com.barzor.model.Restaurante;

public interface RestauranteTransaction {
	
	public void save(Restaurante restaurante);
	
	public Restaurante getById(String id);
	
	public Restaurante getByName(String name);
	
	public Collection<Restaurante> list();

}
