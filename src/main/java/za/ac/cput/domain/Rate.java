package za.ac.cput.domain;

public class Rate {
    String rate;
    String baseRate;

    public Rate(String rate, String baseRate)
    {
        this.rate = rate;
        this.baseRate = baseRate;
    }

    public String getRate()
    {
        return rate;
    }

    public String getBaseRate()
    {
        return baseRate;
    }

    @Override
    public String toString()
    {
        return "Rate{" +
                "rate='" + rate + '\'' +
                ", baseRate='" + baseRate + '\'' +
                '}';
    }

}
