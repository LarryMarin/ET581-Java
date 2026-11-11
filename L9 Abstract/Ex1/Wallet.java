public class Wallet implements Spendable{
    Money [] moneylist;
    int currentsize;
    Wallet(int size){
        moneylist = new Money[size];
        currentsize = 0;
    }
    public double total(){
        double totalMoney = 0;
        for(int i = 0; i < moneylist.length; i++){
            totalMoney += moneylist[i].MoneyAmount();
        }
        return totalMoney;
    }

    public void add(Money m){
        if(currentsize < moneylist.length){
            moneylist[currentsize] = m;
            currentsize++;
        }
        else
            System.out.println("The wallet is full.");
    }

    public void spend(){
        if(currentsize > 0){
            moneylist[currentsize] = null;
            currentsize--;
        }
    }

}
