public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(appName + " - Stock Update: " + stockName + " is now $" + price);
    }
}
