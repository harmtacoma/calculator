package nl.harmtacoma.autorunservices.calculator;

import nl.harmtacoma.autorunservices.calculator.common.IModificationType;
import nl.harmtacoma.autorunservices.calculator.common.Result;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by harm on 16-12-14.
 */

@Path("/calculate")
@Produces(MediaType.APPLICATION_JSON)
public class CalculatorService {

    public CalculatorService() {

    }

    @GET
    public Response calculate(@QueryParam("nmb1") int nmbOne, @QueryParam("nmb2") int nmbTwo, @QueryParam("mode") String mode) {
        try {
            IModificationType calculator = ModeFactory.getModifier(mode);
            Result result = calculator.calculate(nmbOne, nmbTwo);
            return Response.ok(result.getStringresult()).build();
        } catch (NullPointerException e) {
            return Response.status(404).entity(e.getMessage()).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.NOT_ACCEPTABLE).entity(e.getMessage()).build();
        }
    }
}
