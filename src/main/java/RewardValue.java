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
        this.cashValue = Math.round((double) miles / rate * 100) / 100.0;
    }

    double getCashValue(){
        return this.cashValue;
    }

    int getMilesValue(){
        return this.miles;
    }

}
