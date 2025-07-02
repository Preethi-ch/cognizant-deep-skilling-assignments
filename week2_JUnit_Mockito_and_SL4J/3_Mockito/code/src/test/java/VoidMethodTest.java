import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class VoidMethodTest {
    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).sendNotification();

        MyService service = new MyService(mockApi);
        service.triggerNotification();

        verify(mockApi).sendNotification();
    }
}
