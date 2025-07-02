import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class VerifyOrderTest {
    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.methodOne();
        service.methodTwo();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).firstStep();
        inOrder.verify(mockApi).secondStep();
    }
}
