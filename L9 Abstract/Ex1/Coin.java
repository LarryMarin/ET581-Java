class Coin extends Money{
    private int cents;
    Coin(int c){cents = c;}
    void displayAmount(){
        System.out.println(cents+" cents");
    }
    double MoneyAmount(){return cents/100.0;}
}
