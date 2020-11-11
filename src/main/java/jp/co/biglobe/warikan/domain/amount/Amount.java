package jp.co.biglobe.warikan.domain.amount;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
class Amount {
    @Getter
    private int amount;

    public Amount add(Amount other) {
        return new Amount(this.amount + other.amount);
    }

    public Amount subtract(Amount other) {
        return new Amount(this.amount - other.amount);
    }

    public Amount divide(int by) {
        return new Amount(this.amount / by);
    }

    public Amount remainder(int divideBy) {
        return new Amount(this.amount % divideBy);
    }

}
