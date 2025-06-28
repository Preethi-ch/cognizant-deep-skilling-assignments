public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void processData(String input) {
        api.process(input);
    }

    public void triggerNotification() {
        api.sendNotification();
    }

    public void methodOne() {
        api.firstStep();
    }

    public void methodTwo() {
        api.secondStep();
    }
}
