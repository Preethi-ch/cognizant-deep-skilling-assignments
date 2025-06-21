public class NotificationTest {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(baseNotifier);
        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);
        fullNotifier.send("System maintenance scheduled at 10 PM.");
    }
}
