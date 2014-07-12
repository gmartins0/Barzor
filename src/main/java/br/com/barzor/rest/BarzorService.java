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

import br.com.barzor.dao.BarzorData;
import br.com.barzor.model.Restaurante;

@Path("/barzor/restaurante")
public class BarzorService {
		
	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Restaurante getRestauranteById(@PathParam("id") String id){		
		return BarzorData.dataById.get(id);
	}
	
	@GET
	@Path("/name/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Restaurante getRestauranteByName(@PathParam("name") String name){
		
		return BarzorData.dataByName.get(name);
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Restaurante> listRestaurantes(){
		return BarzorData.dataById.values();
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(Restaurante restaurante) {
		
		BarzorData.dataById.put(restaurante.getId(), restaurante);
		BarzorData.dataByName.put(restaurante.getNome(), restaurante);

		String result = "Restaurante salvo : " + restaurante.getNome();
		return Response.status(201).entity(result).build();
		
	}
}
