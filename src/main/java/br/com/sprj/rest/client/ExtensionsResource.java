package br.com.sprj.rest.client;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.smallrye.common.annotation.Blocking;

@Path("/extension")
public class ExtensionsResource {

	@RestClient
	ExtensionsService extensionsService;

	@GET
	@Path("/id/{id}")
	@Blocking
	public Set<Extension> id(String id) {
		return extensionsService.getById(id);
	}

}
