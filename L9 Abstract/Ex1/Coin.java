import Money;

package Ex1;
class Coin extends Money {
    private final int cents;

    Coin(int cents) {
        this.cents = cents;
    }

    @Override
    public double moneyAmount() {
        return cents/100.0;
    }

    @Override
    public void displayAmount() {
        System.out.println(cents + " cents.");
    }
}
