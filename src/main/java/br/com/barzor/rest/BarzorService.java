package br.com.barzor.rest;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.barzor.model.Restaurante;
import br.com.barzor.transaction.RestauranteTransaction;

@Component
@Path("/barzor/restaurante")
public class BarzorService {
	
	@Autowired
	private RestauranteTransaction transaction;
		
	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Restaurante getRestauranteById(@PathParam("id") String id){		
		return transaction.getById(id);
	}
	
	@GET
	@Path("/name/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Restaurante getRestauranteByName(@PathParam("name") String name){
		
		return transaction.getByName(name);
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Restaurante> listRestaurantes(){
		return transaction.list();
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Restaurante restaurante) {
		
		transaction.save(restaurante);

		String result = "Restaurante salvo : " + restaurante.getNome();
		return Response.status(201).entity(result).build();
		
	}
}
