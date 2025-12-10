package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double convert(double dollarValue, double value){
        return value * dollarValue * (1.0 + IOF);
    }
}
