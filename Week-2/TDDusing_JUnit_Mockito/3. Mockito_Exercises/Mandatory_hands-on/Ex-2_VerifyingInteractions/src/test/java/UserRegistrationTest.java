import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void testVerifyWelcomeEmailSent() {
        EmailService mockEmail = mock(EmailService.class);
        UserRegistration registration = new UserRegistration(mockEmail);

        registration.register("test@example.com");

        verify(mockEmail).sendWelcomeEmail("test@example.com");
    }
}
