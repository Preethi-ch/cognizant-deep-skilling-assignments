import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class ArgumentMatchingTest {
    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);
        service.processData("input");

        verify(mockApi).process(eq("input"));
    }
}
