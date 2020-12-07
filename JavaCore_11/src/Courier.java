public class Courier implements Worker {
    private double salary;
    public Warehouse warehouse;

    public Courier(Warehouse myWarehouse){
        this.warehouse = myWarehouse;
    }
    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "Зарплата курьера: " + salary + " руб.";
    }

    @Override
    public void doWork() {
        double balance = warehouse.getBalance();
        salary += 100;
        balance += 1000;
        warehouse.setBalance(balance);
    }

    @Override
    public void bonus() {
        double balance = warehouse.getBalance();
        if(balance > 1000000)
            salary *= 2;
    }
}
