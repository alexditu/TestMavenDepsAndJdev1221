package test.mvn.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("api")
public class DemoRestApi {
    public DemoRestApi() {
        super();
    }

    @POST
    @Consumes("*/*")
    @Produces("text/plain")
    @Path("testRest")
    public String testRest() {
        return "Ok";
    }
}
