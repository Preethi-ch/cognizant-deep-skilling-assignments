public class FinancialForecast {

   
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    
    public static double calculateFutureValueMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];

        memo[years] = calculateFutureValueMemo(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    public static void main(String[] args) {
        double presentValue = 10000;     
        double growthRate = 0.08;        
        int years = 5;

       
        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value (Recursive): ₹%.2f\n", futureValue);

        
        double[] memo = new double[years + 1];
        double futureValueMemo = calculateFutureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future Value (Memoized): ₹%.2f\n", futureValueMemo);
    }
}
