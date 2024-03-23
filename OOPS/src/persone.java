public class persone {
int money;
 persone(int money){
 this.money = money;
}

public void dispay(){
    System.out.println("MONEY = "+money);
}

public void widrow(int n) throws InsufficientMoney{
    if(money < n)
        throw new InsufficientMoney("Not Enough Money !");
    else
        money -= n;
    dispay();
}

    public static void main(String[] args)throws InsufficientMoney{
     persone s = new persone(1000);
     s.widrow(500);
     s.widrow(500);
    }
}
