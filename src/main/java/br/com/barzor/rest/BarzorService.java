package br.com.barzor.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.barzor.model.Restaurante;

@Path("/barzor/restaurante")
public class BarzorService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Restaurante getRestaurante(){
		
		Restaurante restaurante = new Restaurante();
		
		restaurante.setNome("Poisonous Den");
		return restaurante;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Restaurante> listRestaurantes(){
		
		List<Restaurante> lista = new ArrayList<Restaurante>();
		Restaurante restaurante = new Restaurante();		
		restaurante.setNome("Poisonous Den");
		
		lista.add(restaurante);
		
		restaurante = new Restaurante();
		restaurante.setNome("Rat's nest");
		
		lista.add(restaurante);
		return lista;
	}
}
