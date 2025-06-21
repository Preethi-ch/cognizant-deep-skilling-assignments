public class StockMarketTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("StockMobile");
        Observer webApp = new WebApp("StockWeb");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("AAPL", 172.50);
        stockMarket.setStockPrice("GOOGL", 2831.00);

        stockMarket.removeObserver(webApp);

        stockMarket.setStockPrice("MSFT", 332.10);
    }
}
