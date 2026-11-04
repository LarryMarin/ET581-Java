public class TestMoney {
    public static void main(String[] args) {
        Money[] a = new Money[6];
        a[0] = new Bill(5);
        a[1] = new Coin(15);
        a[2] = new Penny();
        a[3] = new Nickel();
        a[4] = new Dime();
        a[5] = new Quarter();

        for (int i = 0; i < a.length; i++) {
            a[i].displayAmount();
        }

        System.out.println("Total = $" + total(a));
    }

    static double total(Money[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].moneyAmount();
        }
        return sum;
    }
}
