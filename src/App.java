/**
 * Created by SnowWolf on 9/16/2016.
 */
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class App extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        HashSet h = new HashSet<Class<?>>();
        h.add( Start.class );
        return h;
    }
}
