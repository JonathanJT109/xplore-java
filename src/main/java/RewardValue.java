public class RewardValue {
    private final double cashValue;
    private final int miles;
    final double rate = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = (int) (cashValue * 0.0035);
    }

    public RewardValue(int miles){
        this.miles = miles;
        this.cashValue = (double) miles / rate;
    }

    double getCashValue(){
        return this.cashValue;
    }

    int getMilesValue(){
        return this.miles;
    }

}
