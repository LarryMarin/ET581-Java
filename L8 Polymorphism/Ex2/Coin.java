class Coin extends Money {
    private int cents;

    Coin(int cents) {
        this.cents = cents;
    }

    public double moneyAmount() {
        return cents;
    }

    public void displayAmount() {
        System.out.println(cents + " cents.");
    }
}
