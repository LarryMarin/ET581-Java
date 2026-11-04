class Bill extends Money {
    private int bill;

    Bill(int bill) {
        this.bill = bill;
    }

    public double moneyAmount() {
        return bill;
    }

    public void displayAmount() {
        System.out.println("$" + bill);
    }
}
