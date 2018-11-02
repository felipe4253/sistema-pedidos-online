package controllers;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.Produto;
import services.ProdutoService;
import services.ProdutoServiceImpl;

@Path("/v1/produto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProdutoController.class);

	private ProdutoService produtoService;
	
	public ProdutoController() {
		produtoService = new ProdutoServiceImpl();
	}
    
    @GET
    public List<Produto> getAll() {
        logger.info("getAllServiços: {}");
        List<Produto> vehicles = produtoService.getAll();
        return vehicles;
    }
//
//    
//    @POST
//    public Response create(Vehicle vehicle, @Context UriInfo uriInfo) {
//        logger.info("create: {}", vehicle);
//        Vehicle savedVehicle = vehicleService.saveVehicle(vehicle);
//        logger.debug("Vehicle created with id = ", savedVehicle.getId());
//        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
//        builder.path(savedVehicle.getId().toString());
//        return Response.created(builder.build()).entity(savedVehicle).build();
//    }
//    
//    @PUT
//    @Path("/{id : \\d+}")
//    public Response update(@PathParam("id") Integer id, Vehicle vehicle) {
//        logger.info("Vehicle ID: {} ", id, vehicle);
//        Vehicle vehicleSaved = vehicleService.findById(id);
//        if (vehicleSaved == null) {
//        	return Response.status(Status.NOT_FOUND).build();
//        }
//        vehicleSaved = vehicleService.saveVehicle(vehicle);
//        return Response.ok().entity(vehicleSaved).build();
//    }
//    
//    @DELETE
//    @Path("/{id : \\d+}")
//    public Response delete(@PathParam("id") Integer id) {
//    	logger.info("Vehicle ID: {} ", id);
//    	vehicleService.deleteById(id);
//    	return Response.noContent().build();
//    }
}