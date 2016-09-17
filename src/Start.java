import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by SnowWolf on 9/16/2016.
 */
@Path("/Start")
public class Start
{
    @GET
    @Produces("text/plain")
    public String getMessage()
    {
        return "Welcome";
    }
}
