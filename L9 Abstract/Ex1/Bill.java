class Bill extends Money {
    private final int bill;

    Bill(int bill) {
        this.bill = bill;
    }

    @Override
    public double moneyAmount() {
        return bill;
    }

    @Override
    public void displayAmount() {
        System.out.println("$" + bill);
    }
}
