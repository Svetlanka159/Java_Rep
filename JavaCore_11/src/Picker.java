public class Picker implements Worker {
    private double salary;
    public Warehouse warehouse;

    public Picker(Warehouse myWarehouse){
        this.warehouse = myWarehouse;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "Зарплата сборщика: " + salary + " руб.";
    }

    public void doWork(){
        int order = warehouse.getCountOrder();
        salary += 80;
        order += 1;
        warehouse.setCountOrder(order);
    }

    @Override
    public void bonus() {
        int curOrder = warehouse.getCountOrder();
        if(curOrder > 1500)
            salary *= 3;
    }

}
