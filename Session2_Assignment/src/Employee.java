public class Employee {
    private String name;
    private double salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Name: " + name
        + "\nSalary: " + salary);
    }

    public void Work(){
        System.out.println("Employee is working.");
    }
}
