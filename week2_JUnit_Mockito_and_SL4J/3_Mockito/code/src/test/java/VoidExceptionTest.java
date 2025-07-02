import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VoidExceptionTest {
    @Test
    public void testVoidMethodThrowsException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Error")).when(mockApi).sendNotification();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, service::triggerNotification);

        verify(mockApi).sendNotification();
    }
}
