public class Warehouse {
    protected int countOrder;
    protected double balance;

    public void setCountOrder(int countOrder){
        this.countOrder = countOrder;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public int getCountOrder(){
        return countOrder;
    }
    public double getBalance(){
        return balance;
    }
    public String toString(){
        return "Количество собранных заказов: " + countOrder + ".  Доход от доставленных заказов: "+balance + " руб.";
    }
}
