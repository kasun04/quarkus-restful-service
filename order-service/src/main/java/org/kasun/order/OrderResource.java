package org.kasun.order;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/order")
public class OrderResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public OrderInfo hello() {

        OrderInfo order = new OrderInfo(); 
        order.setId("101");
        order.setName("Iphone xs");
        order.setDesc("Sample order for iPhone");
        return order;
    }
}