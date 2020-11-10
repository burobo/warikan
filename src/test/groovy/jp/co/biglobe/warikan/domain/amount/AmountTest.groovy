package jp.co.biglobe.warikan.domain.amount

import spock.lang.Specification

class AmountTest extends Specification {
    def addTest() {
        when:
            Amount amount1 = new Amount(10)
            Amount amount2 = new Amount(15)
            amount1.add(amount2)
        then:
            amount1.amount() == 25
    }
}