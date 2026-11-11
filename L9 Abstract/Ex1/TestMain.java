public class TestMain{
    public static void main(String args[]){
        // Money [] a = new Money[6];
        // a[0] = new Bill(5);
        // a[1] = new Coin(15);
        // a[2] = new Quarter();
        // a[3] = new Nickel();
        // a[4] = new Dime();
        // a[5] = new Penny();
        // for(int i=0;i<a.length;i++){
        //     a[i].displayAmount(); 
        //     // 5 dollar 15 cents 25 cents 5 cents 10 cents 1 cents
        // }

        Wallet a = new Wallet(5);
        a.add(new Coin(15));
        a.add(new Bill(15));
        a.add(new Nickel());
        a.add(new Dime());
        a.add(new Quarter());
        System.out.println(a.total());
        
    }
}