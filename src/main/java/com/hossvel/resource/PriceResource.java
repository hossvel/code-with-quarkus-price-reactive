package com.hossvel.resource;

import com.hossvel.model.Price;
import com.hossvel.service.IServicePrice;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


import java.util.List;

@Path( "/prices" )
@Produces( MediaType.APPLICATION_JSON)
@Consumes( MediaType.APPLICATION_JSON)
public class PriceResource {

    @Inject
    IServicePrice iServicePrice;

    @GET
    public Uni<List<Price>> getHistoryPrice() {

    return iServicePrice.getHistoryPrice();

    }

    @GET
    @Path("/history/{product_id}")
    public Response getHistoryById(@PathParam("product_id") Long product_id) {
        
        List<Price> list = iServicePrice.getHistoryById(product_id);
        return list != null ? Response.ok(list).build() : Response.status(Response.Status.NOT_FOUND).build();
    }
}
