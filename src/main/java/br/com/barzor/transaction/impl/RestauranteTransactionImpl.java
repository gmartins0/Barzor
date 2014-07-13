package br.com.barzor.transaction.impl;

import java.util.Collection;

import br.com.barzor.dao.BarzorData;
import br.com.barzor.model.Restaurante;
import br.com.barzor.transaction.RestauranteTransaction;

public class RestauranteTransactionImpl implements RestauranteTransaction{

	@Override
	public void save(Restaurante restaurante) {
		BarzorData.dataById.put(restaurante.getId(), restaurante);
		BarzorData.dataByNome.put(restaurante.getNome(), restaurante);
	}

	@Override
	public Restaurante getById(String id) {
		return BarzorData.dataById.get(id);
	}

	@Override
	public Restaurante getByName(String name) {
		return BarzorData.dataById.get(name);
	}

	@Override
	public Collection<Restaurante> list() {
		return BarzorData.dataById.values();
	}

}
