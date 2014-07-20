package br.com.barzor.transaction;

import java.util.Collection;
import java.util.UUID;

import br.com.barzor.model.Restaurante;

public interface RestauranteTransaction {
	
	public void save(Restaurante restaurante);
	
	public Restaurante getById(UUID id);
	
	public Restaurante getByName(String name);
	
	public Collection<Restaurante> list();

}
