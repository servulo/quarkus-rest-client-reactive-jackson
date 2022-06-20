package br.com.sprj.rest.client;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/extensions")
@RegisterRestClient(configKey = "extensions-api")
public interface ExtensionsService {

	@GET
	Set<Extension> getById(@QueryParam("id") String id);

}
