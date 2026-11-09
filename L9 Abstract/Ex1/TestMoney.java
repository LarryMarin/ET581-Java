package Ex1;
import Bill;
import Money;

public class TestMoney {
    public static void main(String[] args) {
        Money[] a = new Money[6];
        a[0] = new Bill(5);
        a[1] = new Coin(15);
        a[2] = new Penny();
        a[3] = new Nickel();
        a[4] = new Dime();
        a[5] = new Quarter();

        for (Money money : a) {
            money.displayAmount();
        }

        System.out.println("Total = $" + total(a));
    }

    static double total(Money[] moneyItems) {
        double sum = 0;
        for (Money money : moneyItems) {
            sum += money.moneyAmount();
        }
        return sum;
    }
}
