package br.com.barzor.transaction.impl;

import java.util.Collection;
import java.util.UUID;

import br.com.barzor.dao.RestauranteDao;
import br.com.barzor.model.Restaurante;
import br.com.barzor.transaction.RestauranteTransaction;

public class RestauranteTransactionImpl implements RestauranteTransaction{

	@Override
	public void save(Restaurante restaurante) {
		new RestauranteDao().save(restaurante);
	}

	@Override
	public Restaurante getById(UUID id) {
		Restaurante rest = new RestauranteDao().getById(id);
		return rest;
	}

	@Override
	public Restaurante getByName(String name) {
		Restaurante rest = new RestauranteDao().getByName(name);
		return rest;
	}

	@Override
	public Collection<Restaurante> list() {
		return new RestauranteDao().list();
	}

}
