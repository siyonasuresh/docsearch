import static org.junit.Assert.*;
import org.junit.*;

public class DocSearchTest {
    @Test 
	public void testHandleRequest() {
    URLHandler h  = new Handler("technical");  
    assertEquals("Don't know how to handle that path!", h.handleRequest(kdjsf));
	}
}
