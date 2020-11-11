package jp.co.biglobe.warikan.domain.amount;

class Amount {
    private int amount = 0;

    public Amount(int amount) {
        this.amount(amount);
    }

    private void amount(int amount) {
        this.amount = amount;
    }

    public Amount add(Amount other) {
        return new Amount(this.amount + other.amount);
    }

    public Amount subtract(Amount other) {
        return new Amount(this.amount - other.amount);
    }

    public Amount divide(int by) {
        return new Amount(this.amount / by);
    }

    public int amount() {
        return this.amount;
    }
}
