import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultipleReturnsTest {
    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("First Call", "Second Call");

        MyService service = new MyService(mockApi);
        String first = service.fetchData();
        String second = service.fetchData();

        assertEquals("First Call", first);
        assertEquals("Second Call", second);
    }
}
