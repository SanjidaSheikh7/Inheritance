public class Manager extends Employee{
    private double bonus;

    public Manager(String name, long salary, long bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public void Work() {
        System.out.println("Manager is organizing the team.");
    }
}
