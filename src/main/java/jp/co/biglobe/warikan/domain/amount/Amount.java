package jp.co.biglobe.warikan.domain.amount;

class Amount {
    private int amount = 0;

    public Amount(int amount) {
        this.amount(amount);
    }

    private void amount(int amount) {
        this.amount = amount;
    }

    public void add(Amount other) {
        this.amount(this.amount + other.amount);
    }

    public int amount() {
        return this.amount;
    }
}
