public class UserRegistration {
    private EmailService emailService;

    public UserRegistration(EmailService emailService) {
        this.emailService = emailService;
    }

    public void register(String email) {
        emailService.sendWelcomeEmail(email);
    }
}
